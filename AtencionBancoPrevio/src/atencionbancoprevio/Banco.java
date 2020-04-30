/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionbancoprevio;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Cristian
 */
public class Banco{
//MAS MODIFICACIONES XD
    private static final String CONSIGNACION = "Consignacion";
    private static final String RETIRO = "Retiro";
    private static final String PAGO_SERVICIO = "Pago Servicio";
    private LinkedList<Caja> cajas; 

    public Banco() {
        cajas = new LinkedList();
    }
    
    public Caja darPrimeraCaja(){
        return null;
    }
    
    public void agregarCaja(int numCaja, String tipoTransaccion, double dineroInicial){
        cajas.add(new Caja(numCaja, tipoTransaccion, dineroInicial));
    }
    
    public void eliminarCaja(int numCaja){
        
        if(this.cajas.isEmpty())
            return;
        
        Caja x = cajas.get(numCaja-1);
        
        if(!x.getClientesCola().isEmpty())
            cajas.remove(numCaja-1);
    }
    
    public Caja buscarCaja(int numCaja){
        if(this.cajas.isEmpty())
            return null;
        return this.cajas.get(numCaja-1);
    }
    
    public Cliente buscarCliente(int idCliente){
        Cliente cliente;
        
        for (Caja c : cajas) {
            cliente = c.buscarClienteCola(idCliente);
            if (cliente!=null) {
                return cliente;
            }
        }
        return null;
    }
    
    public void agregarCliente(int idCliente, String tipoTransaccion){
        //Buscar las cajas con el tipo de transaccion
        LinkedList<Caja> ca = new LinkedList();
        for (Caja c : cajas) {
            if(c.getTipoTransaccion().equals(tipoTransaccion)){
                ca.add(c);
            }
        }
        //Ver cual caja tiene el menor tiempo de transaccion
        Collections.sort(ca);
        cajas.getFirst().agregarCliente(idCliente,tipoTransaccion);
    }
    
    public void despacharCliente(int idCaja, int valorTransaccion){
        
        Caja caja;
        for (Caja c : this.cajas) {
            if (c.getIdentificador()==idCaja) {
                c.despacharCliente();
                break;
            }
        }
        
    }
    
    public void generarReporte(String rutaNombre, String nombreArchivo){
            //TIPO DE TRANSACCION ATENDIDA POR CAJA, MONTO INICIAL DEL DINERO DE CADA CAJA
            //EL MONTO ACTUAL DE DINERO, NUMERO DE CLIENTES ATENDIDOS POR CADA CAJA
    }
    
    private void verificarInvariante(){
    
    }
}
