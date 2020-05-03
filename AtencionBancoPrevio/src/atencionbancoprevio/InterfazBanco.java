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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.LinkedList;
public class InterfazBanco extends JFrame implements ActionListener{
    
    LinkedList<Caja> cajas = new LinkedList();
    Banco banco = new Banco();
    private int contadorCajas = 0;
    private JLabel labelBienvenido,labelTitle,labelCaja1,labelCaja1a,labelCaja2,labelCaja2a,labelCaja3,labelCaja3a,labelCaja4,labelCaja4a,
                   labelCaja5,labelCaja5a,labelCaja6,labelCaja6a,labelCaja8,labelCaja8a,labelCajaX,labelVerClientes;
     
    
    private JButton agregarCaja,eliminarCaja,buscarCliente,agregarCliente,
                    despacharCliente,generarReporte,recargar,verClientes;
    
    
    String[] TiposTransacciones = {
            "Consignacion",
            "Retiro",
            "Pago Servicio"
        };
    
    JComboBox jcb = new JComboBox(TiposTransacciones);
    //coment
               
    public InterfazBanco() {
      setLayout(null);
      jcb.setEditable(false);
      
      verClientes = new JButton("ver");
      verClientes.setBounds(300,95,70,25);
      verClientes.setVisible(true);
      add(verClientes);
      verClientes.addActionListener(this);
      
      
      labelVerClientes = new JLabel("Ver Clientes en Cola");  
      labelVerClientes.setBounds(170,80,500,50);
      labelVerClientes.setFont(new Font("Andale Mono", 1, 12));
      labelVerClientes.setForeground(new Color(0, 0, 0));
      labelVerClientes.setVisible(true);
      add(labelVerClientes);
      
      labelCaja1 = new JLabel();  
      labelCaja1.setBounds(270,180,100,50);
      labelCaja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/fac.png")));
      labelCaja1.setFont(new Font("Andale Mono", 1, 12));
      labelCaja1.setForeground(new Color(0,0,0));
      labelCaja1.setVisible(false);
      labelCaja1a = new JLabel();
      labelCaja1a.setFont(new Font("Andale Mono", 1, 12));
      labelCaja1a.setForeground(new Color(0,0,0));
      labelCaja1a.setBounds(250,220,150,80);
      labelCaja1a.setVisible(false);
      add(labelCaja1a);
      add(labelCaja1);
      
      labelCaja2 = new JLabel();  
      labelCaja2.setBounds(270,300,500,50);
      labelCaja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/fac.png")));
      labelCaja2.setFont(new Font("Andale Mono", 1, 12));
      labelCaja2.setForeground(new Color(0, 0, 0));
      labelCaja2.setVisible(false);
      labelCaja2a = new JLabel();
      labelCaja2a.setFont(new Font("Andale Mono", 1, 12));
      labelCaja2a.setForeground(new Color(0, 0, 0));
      labelCaja2a.setBounds(250,330,150,80);
      labelCaja2a.setVisible(false);
      add(labelCaja2a);
      add(labelCaja2);
      
      labelCaja3 = new JLabel();  
      labelCaja3.setBounds(270,410,500,50);
      labelCaja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/fac.png")));
      labelCaja3.setFont(new Font("Andale Mono", 1, 12));
      labelCaja3.setForeground(new Color(0, 0, 0));
      labelCaja3.setVisible(false);
      labelCaja3a = new JLabel();
      labelCaja3a.setFont(new Font("Andale Mono", 1, 12));
      labelCaja3a.setForeground(new Color(0, 0, 0));
      labelCaja3a.setBounds(250,440,150,80);
      labelCaja3a.setVisible(false);
      add(labelCaja3a);
      add(labelCaja3);
      
      labelCaja4 = new JLabel();  
      labelCaja4.setBounds(500,185,500,50);
      labelCaja4.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/fac.png")));
      labelCaja4.setFont(new Font("Andale Mono", 1, 12));
      labelCaja4.setForeground(new Color(0, 0, 0));
      labelCaja4.setVisible(false);
      labelCaja4a = new JLabel();
      labelCaja4a.setFont(new Font("Andale Mono", 1, 12));
      labelCaja4a.setForeground(new Color(0, 0, 0));
      labelCaja4a.setBounds(480,235,500,50);
      labelCaja4a.setVisible(false);
      add(labelCaja4a);
      add(labelCaja4);
      
      labelCaja5 = new JLabel();  
      labelCaja5.setBounds(500,305,500,50);
      labelCaja5.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/fac.png")));
      labelCaja5.setFont(new Font("Andale Mono", 1, 12));
      labelCaja5.setForeground(new Color(0, 0, 0));
      labelCaja5.setVisible(false);
      labelCaja5a = new JLabel();
      labelCaja5a.setFont(new Font("Andale Mono", 1, 12));
      labelCaja5a.setForeground(new Color(0, 0, 0));
      labelCaja5a.setBounds(480,350,500,50);
      labelCaja5a.setVisible(false);
      add(labelCaja5a);
      add(labelCaja5);
      
      labelCaja6 = new JLabel();  
      labelCaja6.setBounds(500,415,500,50);
      labelCaja6.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagenes/fac.png")));
      labelCaja6.setFont(new Font("Andale Mono", 1, 12));
      labelCaja6.setForeground(new Color(0, 0, 0));
      labelCaja6.setVisible(false);
      labelCaja6a = new JLabel();
      labelCaja6a.setFont(new Font("Andale Mono", 1, 12));
      labelCaja6a.setForeground(new Color(0, 0, 0));
      labelCaja6a.setBounds(480,457,500,50);
      labelCaja6a.setVisible(false);
      add(labelCaja6a);
      add(labelCaja6);
      
      labelBienvenido = new JLabel("Opciones ");  
      labelBienvenido.setBounds(50,30,500,50);
      labelBienvenido.setFont(new Font("Andale Mono", 1, 18));
      labelBienvenido.setForeground(new Color(0, 0, 0));
      add(labelBienvenido);

      labelTitle = new JLabel("Banco");
      labelTitle.setBounds(250,140,900,25);
      labelTitle.setFont(new Font("Andale Mono", 0, 18));
      labelTitle.setForeground(new Color(0, 0, 0));
      add(labelTitle);

      
      
      
      agregarCaja = new JButton("Agregar Caja");
      agregarCaja.setBounds(50,198,145,25);
      agregarCaja.setVisible(true);
      add(agregarCaja);
      agregarCaja.addActionListener(this);
      
      
      eliminarCaja = new JButton("Eliminar Caja ");
      eliminarCaja.setBounds(50,228,145,25);
      eliminarCaja.setVisible(true);
      add(eliminarCaja);
      eliminarCaja.addActionListener(this);
      
      buscarCliente = new JButton("Buscar Cliente ");
      buscarCliente.setBounds(50,255,145,25);
      buscarCliente.setVisible(true);
      add(buscarCliente);
      buscarCliente.addActionListener(this);
      
      agregarCliente = new JButton("Agregar Cliente ");
      agregarCliente.setBounds(50,282,145,25);
      agregarCliente.setVisible(true);
      add(agregarCliente);
      agregarCliente.addActionListener(this);
      
      despacharCliente = new JButton("Despachar Cliente ");
      despacharCliente.setBounds(50,308,145,25);
      despacharCliente.setVisible(true);
      add(despacharCliente);
      despacharCliente.addActionListener(this);
      
      generarReporte = new JButton("Generar Reporte");
      generarReporte.setBounds(50,335,145,25);
      generarReporte.setVisible(true);
      add(generarReporte);
      generarReporte.addActionListener(this);
      
      
      recargar = new JButton("Recargar Caja");
      recargar.setBounds(50,364,145,25);
      recargar.setVisible(true);
      add(recargar);
      recargar.addActionListener(this);
      
      
    }
    

    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource() == agregarCaja){// agregando caja
           
            String numeroCaja = JOptionPane.showInputDialog("Escribe el numero de la caja");
            String dineroInicial = JOptionPane.showInputDialog("Escribe el Dinero Inicial de la caja");
            
            JOptionPane.showMessageDialog( null, jcb, "seleccione el Tipo de transaccion", JOptionPane.QUESTION_MESSAGE);
            int dineroInicialEntero = Integer.parseInt(dineroInicial);
            int numeroCajaEntero = Integer.parseInt(numeroCaja);
            
            if(numeroCaja.equals("1")){
                labelCaja1.setVisible(true);
            labelCaja1a.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Id :"+numeroCaja+"<p><html> "+jcb.getSelectedItem().toString()+"<p><html> &nbsp&nbsp&nbsp&nbsp $: "+ dineroInicial);
            
            labelCaja1a.setVisible(true);
//            
            Caja caja1 = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(caja1);
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
            
            }
        
            else if(numeroCaja.equals("2")){
            labelCaja2a.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Id :"+numeroCaja+"<p><html> "+jcb.getSelectedItem().toString()+"<p><html> &nbsp&nbsp&nbsp&nbsp $: "+ dineroInicial);
            labelCaja2.setVisible(true);
            labelCaja2a.setVisible(true);
            Caja caja2 = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(caja2);
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
        }
        else if(numeroCaja.equals("3")){
            labelCaja3a.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Id :"+numeroCaja+"<p><html> "+jcb.getSelectedItem().toString()+"<p><html> &nbsp&nbsp&nbsp&nbsp $: "+ dineroInicial);
            labelCaja3.setVisible(true);
            labelCaja3a.setVisible(true);
            Caja caja3 = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(caja3);
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
        }
        else if(numeroCaja.equals("4")){
            labelCaja4a.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Id :"+numeroCaja+"<p><html> "+jcb.getSelectedItem().toString()+"<p><html> &nbsp&nbsp&nbsp&nbsp $: "+ dineroInicial);
            labelCaja4.setVisible(true);
            labelCaja4a.setVisible(true);
            this.setBounds(0,0,600,540);
            this.setLocationRelativeTo(null);
            Caja caja4 = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(caja4);
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
        }
        else if(numeroCaja.equals("5")){
            labelCaja5a.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Id :"+numeroCaja+"<p><html> "+jcb.getSelectedItem().toString()+"<p><html> &nbsp&nbsp&nbsp&nbsp $: "+ dineroInicial);
            labelCaja5.setVisible(true);
            labelCaja5a.setVisible(true);
            this.setBounds(0,0,600,540);
            this.setLocationRelativeTo(null);
            Caja caja5 = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(caja5);
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
        }else if(numeroCaja.equals("6")){
            labelCaja6a.setText("<html>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Id :"+numeroCaja+"<p><html> "+jcb.getSelectedItem().toString()+"<p><html> &nbsp&nbsp&nbsp&nbsp $: "+ dineroInicial);
            labelCaja6.setVisible(true);
            labelCaja6a.setVisible(true);
            this.setBounds(0,0,600,540);
            this.setLocationRelativeTo(null);
            Caja caja6 = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(caja6);
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
        }else{
            Caja cajaX = new Caja(numeroCajaEntero,jcb.getSelectedItem().toString(),dineroInicialEntero);
            if(!elementoExiste(banco.getCajas(), numeroCajaEntero)){
                banco.getCajas().add(cajaX);
                String respuesta = JOptionPane.showInputDialog("La caja ha sido agregada Exitosamente");
                contadorCajas++;
            }else JOptionPane.showInputDialog("el numero de la caja ya existe");
            
        }
            
            
            
        }
        if(e.getSource() == eliminarCaja){
            
            if(!banco.getCajas().isEmpty()){
                String digitenumeroEliminar = JOptionPane.showInputDialog("digite el numero de la caja que desea eliminar");
                int numeroEliminar = Integer.parseInt(digitenumeroEliminar);
                if(elementoExiste(banco.getCajas(), numeroEliminar)){
                for (int i = 0; i < banco.getCajas().size(); i++) {
     
    if (numeroEliminar == banco.getCajas().get(i).getIdentificador()&& banco.getCajas().get(i).getCantidadClientes()==0) {
         banco.getCajas().remove(i);
         String seEncuentra = JOptionPane.showInputDialog("se elimino la caja");
         
         if(digitenumeroEliminar.equals("1")){
                labelCaja1.setVisible(false);
            }
         else if(digitenumeroEliminar.equals("2")){
             labelCaja2.setVisible(false);
         }
         else if(digitenumeroEliminar.equals("3")){
             labelCaja3.setVisible(false);
         }
         else if(digitenumeroEliminar.equals("4")){
             labelCaja4.setVisible(false);
         }
         else if(digitenumeroEliminar.equals("5")){
             labelCaja5.setVisible(false);
         }
         else if(digitenumeroEliminar.equals("6")){
             labelCaja6.setVisible(false);
         }
         
    }
    
    
}
                }else{
                    String noExiste = JOptionPane.showInputDialog("el numero de la caja no existe");
                }
                
            }
            else {
                String vacio = JOptionPane.showInputDialog("no ahi cajas por eliminar");
            }
            
            
        }
        
        if(e.getSource() == buscarCliente){
            int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del cliente"));
            Cliente cliente = banco.buscarCliente(idCliente);
            if(cliente == null){
                JOptionPane.showMessageDialog(this,"El cliente no se encuentra registrado");
            }else{
                JOptionPane.showMessageDialog(this,"se encontro el cliente con Id: " + cliente.getDocumento()+
                " y tipo de transaccion: " + cliente.getTipoTransaccion());
            }
        }
        
        if(e.getSource() == agregarCliente){
        String idCliente = JOptionPane.showInputDialog("Digite el id del cliente");
        int idClienteI = Integer.parseInt(idCliente);
        JOptionPane.showMessageDialog( null, jcb, "seleccione el Tipo de transaccion", JOptionPane.QUESTION_MESSAGE);
        String edadClienteS = JOptionPane.showInputDialog("Digite la edad del cliente");
        int edadCliente = Integer.parseInt(edadClienteS);
           if(banco.agregarCliente(idClienteI,edadCliente,jcb.getSelectedItem().toString())){
               JOptionPane.showInputDialog("se agrego el cliente");
           }else{
               JOptionPane.showInputDialog("NO hay cajas para ese tipo de transaccion");
           }
        
    }
        
        if(e.getSource() == despacharCliente){
            int numCaja = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la caja"));
            double valorTransaccion = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la transaccion"));
            if(banco.despacharCliente(numCaja, valorTransaccion)){
                JOptionPane.showInputDialog("Cliente despachado");
            }else JOptionPane.showInputDialog("se debe recargar la caja");
        }
        
        if(e.getSource() == generarReporte){
          InterfazReporte interfas = new InterfazReporte();
          interfas.setBounds(0,0,540,400);
          interfas.setVisible(true);
          interfas.setResizable(false);
          interfas.setLocationRelativeTo(null);
          interfas.textArea.setText(banco.generarReporte());
        }
        
        if(e.getSource() == recargar){//implementando el boton de recarga
            int numCaja = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la caja"));
            double valorTransaccion = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la transaccion"));
            if(banco.recargarCaja(numCaja, valorTransaccion)){
                JOptionPane.showInputDialog("se recargo la caja");
            }else JOptionPane.showInputDialog("la caja no se puede recargar por que no es de retiro");
            
        }
        
        if(e.getSource() == verClientes){
          int numCaja = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la caja"));
          InterfazReporte interfas = new InterfazReporte();
          interfas.setBounds(0,0,540,400);
          interfas.setVisible(true);
          interfas.setResizable(false);
          interfas.setLocationRelativeTo(null);
          interfas.textArea.setText(banco.verClientes(numCaja));
        }
    }

    

    public static void main(String args[]) {
       InterfazBanco ventanaPrincipal = new InterfazBanco();
       ventanaPrincipal.setBounds(0,0,640,545);
       ventanaPrincipal.setVisible(true);
       ventanaPrincipal.setResizable(false);
       ventanaPrincipal.setLocationRelativeTo(null);
   } 
    
    public boolean elementoExiste(LinkedList<Caja> cajas, int numeroBuscado){
        boolean existe = false;
        for(int i = 0; i < cajas.size(); i++){
            if(cajas.get(i).getIdentificador() == numeroBuscado){
                return existe = true;
            }
        }
        return existe;
    }
}
