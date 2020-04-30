/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionbancoprevio;
/**
 *
 * @author usuario
 */
public class Cliente {
    private int documento; 
    private String Transaccion;

    public Cliente() {
    }

    public Cliente(int documento, String Transaccion) {
        this.documento = documento;
        this.Transaccion = Transaccion;
    }
    
   // GETTER AND SETTER

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTransaccion() {
        return Transaccion;
    }

    public void setTransaccion(String Transaccion) {
        this.Transaccion = Transaccion;
    }
    
    
}