/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriotelefonico;

/**
 *
 * @author Cristian
 */
public class Contacto implements Comparable<Contacto>{
    
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;

    public Contacto() {
    }

    public Contacto(String nombre, String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    public String toString2() {
        return "Nombre : "+getNombre()+"\nTelefono : "+getTelefono()+"\nDireccion : "+getDireccion()+"\nEmail : "+getEmail();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Contacto o) {
        if(o.getNombre().toLowerCase().charAt(0) < this.getNombre().toLowerCase().charAt(0))
            return 1;
        if(o.getNombre().toLowerCase().charAt(0) > this.getNombre().toLowerCase().charAt(0))
            return -1;
        else
            return 0;
    }
    
    
    
}
