/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuariopc
 */
public class Coordinador {
        public String asignarPersona() {
         String op= JOptionPane.showInputDialog ("seleccione una opcion \n"
        +"1-Asignar nombre \n"
        +"2-Asignar apellido\n"
        +"3-Asignar ciudad\n"
        +"4-Asignar telefono");
         return op;
    }
      public String retornarPersona() {
         String op= JOptionPane.showInputDialog("seleccione una opcion \n"
        +"1-Retornar nombre  \n"
        +"2-Retornar apellido\n"
        +"3-Retornar ciudad\n"
        +"4-Retornar telefono");
         return op;
    }
public String menuPersona(){
       String op = "";
        do{
            op= JOptionPane.showInputDialog("selecione una opcion\n"
                    + "1-Asignar datos\n"
                    + "2-Retornar datos\n"
                    +"3-Salir\n");
        switch(op){
            case "1":
                JOptionPane.showInputDialog(asignarPersona());
            break;
             case "2":
                 JOptionPane.showInputDialog(retornarPersona());
            break;
            
        }
        } while (!op.equals("3"));
     return op;
}
}
