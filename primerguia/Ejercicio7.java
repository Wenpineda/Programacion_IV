/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerguia;

import javax.swing.JOptionPane;

/**
 *
 * @author cance
 */
public class Ejercicio7 {
    
     public static void main(String[] args) {
        double Radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del Radio de l Circunferencia: "));

        double Area;
        double Volumen;
        
        //estamos utilizando Math.PI de la clase Math
        //para obtener el valor de pi y Math.pow(base, exponente) para elevar el radio al cuadrado.
        Area = Math.PI * Math.pow(Radio, 2);
        Volumen = 1.33 *(Math.PI * Math.pow(Radio,3)); //1.33 = 4/3, lo puse asi porque no me funcionaba con el 4/3 
       
        JOptionPane.showMessageDialog(null, "El Area de la Circunerencia es: " + Area + " cm " + 
                " \ny su Volumen es de: " + Volumen + " cm ","Resultados", JOptionPane.PLAIN_MESSAGE );
        
        System.exit (0);
   }
}
