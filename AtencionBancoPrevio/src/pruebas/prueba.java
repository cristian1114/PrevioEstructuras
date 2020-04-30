/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.LinkedList;
import atencionbancoprevio.Caja;
import java.util.Collections;
/**
 *
 * @author Cristian
 */
public class prueba {
    
    public static void main(String[] args) {
        
        LinkedList<Caja> cajas = new LinkedList();
        
        cajas.add(new Caja(2,"retiro",200000));
        cajas.add(new Caja(3,"pago",200000));
        cajas.add(new Caja(4,"retiro",200000));
        cajas.add(new Caja(2,"retiro",200000));

        for (Caja c : cajas) {
            System.out.println("Tiempo "+c.getTiempoEspera());
        }
        
        Collections.sort(cajas);
        System.out.println("despues \n");
        for (Caja c : cajas) {
            System.out.println("Tiempo "+c.getTiempoEspera());
        }
        
        System.out.println("el menor es "+cajas.getFirst().getTiempoEspera());
        
    }
    
}
