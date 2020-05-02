/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionbancoprevio;
import java.util.LinkedList;

/**
 *
 * @author Jesus
 */
public class Caja implements Comparable<Caja>{
    
    private int identificador;
    private double dineroInicial;
    private int dineroCaja; 
    private String tipoTransaccion;
    private LinkedList<Cliente> clientesCola;
    private LinkedList<Cliente> clientesAtendidos;
    private final int TIEMPO_ATENCION_CONSIGNACION=7;
    private final int TIEMPO_ATENCION_RETIRO=5;
    private final int TIEMPO_ATENCION_PAGO_SERVICIO=8;

    public Caja() {
        this.clientesCola=new LinkedList();
        this.clientesAtendidos=new LinkedList();
    }

    public Caja(int identificador, String transaccion, double dineroInicial) {
        this.identificador = identificador;
        this.dineroInicial = dineroInicial;
        this.tipoTransaccion = transaccion;
        this.clientesCola=new LinkedList();
        this.clientesAtendidos=new LinkedList();
        this.dineroCaja=0;
    }
    
    public void agregarCliente(int idCliente, int edad, String tipoTransaccion){
        this.clientesCola.add(new Cliente(idCliente, edad, tipoTransaccion));
    }
     
    public void despacharCliente(){
        this.clientesAtendidos.add(this.clientesCola.poll());
    }
    
    
    public float getTiempoEspera(){
        if(this.tipoTransaccion.equals("Consignacion"))
            return this.TIEMPO_ATENCION_CONSIGNACION*this.clientesCola.size();
        if(this.tipoTransaccion.equals("Retiro"))
            return this.TIEMPO_ATENCION_RETIRO*this.clientesCola.size();
        if(this.tipoTransaccion.equals("Pago servicio"))
            return this.TIEMPO_ATENCION_PAGO_SERVICIO*this.clientesCola.size();
            
        return 0;
    }
    
    public Cliente buscarClienteCola(int documento){
        for(Cliente cliente: this.clientesCola){
            if(cliente.getDocumento()==documento){return cliente;}
        }
    return null;
    }
    
    public Cliente  buscarClienteAtendidos(int documento){
        
        for(Cliente cliente: this.clientesAtendidos){
            if(cliente.getDocumento()==documento){
                return cliente;
            }
        }
    return null;
    }
    // GETTERS AND SETTERS

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public int getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String transaccion) {
        this.tipoTransaccion = transaccion;
    }

    public int getCantidadClientes() {
        return this.clientesCola.size();
    }

    public LinkedList<Cliente> getClientesCola() {
        return clientesCola;
    }

    public void setClientesCola(LinkedList<Cliente> clientesCola) {
        this.clientesCola = clientesCola;
    }
    
    

    public LinkedList<Cliente> getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(LinkedList<Cliente> clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }
    
    @Override
    public int compareTo(Caja o) {

        if(this.getTiempoEspera() > o.getTiempoEspera())
            return 1;
        if(this.getTiempoEspera() < o.getTiempoEspera())
            return -1;
        else
            return 0;
    }

    
    
    
}
