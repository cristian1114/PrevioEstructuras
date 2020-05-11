/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriotelefonico;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Cristian
 */
public class DirectorioTelefonico{

   private LinkedList<Contacto> contactos;

    public DirectorioTelefonico() {
        contactos = new LinkedList();
    }
    
    public void agregarContacto(String nombre, String telefono, String direccion, String email){
        Contacto c = new Contacto(nombre,telefono,direccion,email);
        if(contactoExiste(c))
            return;
        this.contactos.add(c);
    }
    
    public String verContacto(int pos){
        Contacto c = this.getContactos().get(pos);
        return c.toString2();
    }
    
    public void eliminarContacto(int i){
        if(this.getContactos().get(i)!=null)
            this.getContactos().remove(i);
    }
    
    public void ordenar(){
        Collections.sort(this.getContactos());
    }
    
    public Contacto buscarContacto(String nombre){
        if(!this.contactos.isEmpty()){
        for (Contacto c : this.contactos) {
            if(c.getNombre().trim().toLowerCase().equals(nombre.trim().toLowerCase()))
                return c;
            }
        }
        return null;
    }

   @Override
    public String toString(){
        String rta ="";
        for (Contacto c : this.contactos) {
            rta+=c.toString()+"\n";
        }
    return rta;
    }
    
    private boolean contactoExiste(Contacto c){
        if(!this.contactos.isEmpty()){
        for (Contacto contacto : this.contactos) {
            if(contacto.getNombre().equals(c.getNombre()) && contacto.getTelefono().equals(c.getTelefono()))
                return true;
        }}
        return false;
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

   
   
    
}
