/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerguia;

import javax.swing.JOptionPane;

/**
 *
 * @author WENDY LISETH CHACON PINEDA
 * 
 * Escribir un programa que calcule el perimetro
 * y area de un rectanulo, pidiendo vlores de los 
 * lados
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        int Base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la base del Rectangulo: "));
        int Altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del Rectangulo: "));
        
        int Area;
        int Perimetro;
        
        Area = Base * Altura;
        Perimetro = 2*(Base+Altura);
        
        JOptionPane.showMessageDialog(null, "El Area del Rectangulo es: " + Area + " cm " + 
                " \ny su Perimetro es de: " + Perimetro + " cm ","Resultados", JOptionPane.PLAIN_MESSAGE );
        
        System.exit (0);
        
    }
}
