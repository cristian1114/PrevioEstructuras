package atencionbancoprevio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johan leon
 */
public class Cliente {
    
    private Cliente siguiente;
    private Cliente anterior;
    private int documento;
    private String tipoTransaccion;
    
    public void cambiarSiguiente(Cliente nSiguiente){
        this.siguiente = nSiguiente;
    }
    
    public void cambiarAnterior(Cliente nAnterior){
        this.anterior = nAnterior;
    }
    
    

    public Cliente() {
    }

    public Cliente(int documento, String tipoTransaccion) {
        
        this.documento = documento;
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    


    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }

    public Cliente getAnterior() {
        return anterior;
    }

    public void setAnterior(Cliente anterior) {
        this.anterior = anterior;
    }

    

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
    
    
    
    
}
