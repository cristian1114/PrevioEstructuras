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
    private double dineroCaja; 
    private String tipoTransaccion;
    private LinkedList<Cliente> clientesCola;
    private int clientesAtendidos;
    private final int TIEMPO_ATENCION_CONSIGNACION=7;
    private final int TIEMPO_ATENCION_RETIRO=5;
    private final int TIEMPO_ATENCION_PAGO_SERVICIO=8;

    public Caja() {
    }

    public Caja(int identificador, String transaccion, double dineroInicial) {
        this.identificador = identificador;
        this.dineroInicial = dineroInicial;
        this.tipoTransaccion = transaccion;
        this.clientesCola=new LinkedList();
        this.clientesAtendidos=0;
        this.dineroCaja=dineroInicial;
    }
    
    public void agregarCliente(int idCliente, int edad, String tipoTransaccion){
        this.clientesCola.add(new Cliente(idCliente, edad, tipoTransaccion));
    }
    
    public void recargarCaja(double monto){
        this.dineroCaja+=monto;
    }
     
    public boolean despacharCliente(double monto){
        
        if(this.getClientesCola().isEmpty())
            return false;
        if(this.tipoTransaccion.equals("Retiro")){
            if(dineroCaja-monto < 0)
                return false;
            else
                this.dineroCaja-=monto;
        }
        if(this.tipoTransaccion.equals("Consignacion") || this.tipoTransaccion.equals("Pago Servicio"))
            dineroCaja+=monto;
        this.clientesAtendidos++;
        this.clientesCola.poll();
        
        return true;
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
            if(cliente.getDocumento()==documento){
                return cliente;
            }
        }
    return null;
    }
//    
//    public Cliente  buscarClienteAtendidos(int documento){
//        
//        for(Cliente cliente: this.clientesAtendidos){
//            if(cliente.getDocumento()==documento){
//                return cliente;
//            }
//        }
//    return null;
//    }
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

    public double getDineroCaja() {
        return dineroCaja;
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
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
