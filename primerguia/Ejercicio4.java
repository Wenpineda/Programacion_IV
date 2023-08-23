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
 * Escriba un programa que cacule las 4 operaciones
 * basicas (suma, resta, multiplicacion y division)
 * ingresando 2 valores.
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        
        int numero1;
        int numero2;
 
        int suma;
        int resta;
        int multiplicacion;
        int division;

        
        primernumero = JOptionPane.showInputDialog("Ingresa el Primer Numero entero: ");
        segundonumero = JOptionPane.showInputDialog("Ingresa el Segundo Numero entero: ");
        
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        
        suma = numero1 + numero2;        
        resta = numero1 - numero2;        
        multiplicacion = numero1 * numero2;      
        division = numero1 / numero2;


        JOptionPane.showMessageDialog(null, "La suma es: " + suma + " \nLa Resta es: " + resta + " \nLa Multiplicacion es: " + multiplicacion + " \nLa Division es: " + division,
                "Resultados", JOptionPane.PLAIN_MESSAGE );
        
        System.exit (0); 
    }
}
