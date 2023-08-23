package com.mycompany.primerguia;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WENDY LISETH CHACON PINEDA
 * 
 * Escribir un programa que determine cual es el mayor 
 * numero de 3 ingresados por el usuario.
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer Numero Entero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo Numero Entero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tercer Numero Entero"));
        
        if (numero1 > numero2 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null, 
                    "El primer Numero es Mayor: " + numero1, "Informacion",JOptionPane.INFORMATION_MESSAGE );
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null, 
                    "El Segundo Numero es Mayor: " + numero2,"Informacion",JOptionPane.INFORMATION_MESSAGE );
        }
        else if (numero3 > numero2 && numero2 > numero1) {
            JOptionPane.showMessageDialog(null, 
                    "El Tercer Numero es Mayor: " + numero3,"Informacion",JOptionPane.INFORMATION_MESSAGE );
        }
        else {
            JOptionPane.showMessageDialog(null, "Los Numeros Son iguales");
        }
    }
}
