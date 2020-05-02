/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import atencionbancoprevio.Banco;
import java.util.LinkedList;
import atencionbancoprevio.Caja;
import java.util.Collections;
/**
 *
 * @author Cristian
 */
public class prueba {
    
    public static void main(String[] args) {
        
        Banco b = new Banco();
        
        b.agregarCaja(2,"Retiro",200000);
        b.agregarCaja(3,"Pago Servicio",200300);
        b.agregarCaja(4,"Retiro",200000);
        b.agregarCaja(1,"Retiro",200000);
        
        b.agregarCliente(1, 23, "Retiro");
        b.agregarCliente(3, 25, "Retiro");
        b.agregarCliente(4, 26, "Retiro");
        b.agregarCliente(2, 45, "Pago Servicio");
        
        b.despacharCliente(4, 200000);
        
        System.out.println(b.generarReporte());
        
        
        
//
//        for (Caja c : cajas) {
//            System.out.println("Tiempo "+c.getTiempoEspera());
//        }
//        
//        Collections.sort(cajas);
//        System.out.println("despues \n");
//        for (Caja c : cajas) {
//            System.out.println("Tiempo "+c.getTiempoEspera());
//        }
//        
//        System.out.println("el menor es "+cajas.getFirst().getTiempoEspera());
        
    }
    
}
