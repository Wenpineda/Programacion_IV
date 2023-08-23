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
 * Escribir un programa que permita Ingresar una palabra y un numero, e imprima
 * la palabra el numero de veces ingresado
 */
public class Ejercicio3 {
    
       public static void main(String[] args) {
           String palabra;
           String numero;
           
           int entero;
           
           numero = JOptionPane.showInputDialog("Ingresa el Primer Numero entero: "); 
           palabra = JOptionPane.showInputDialog("Ingresa una palabra: ");
           
           entero = Integer.parseInt(numero);
           
           StringBuilder mensaje = new StringBuilder(); //se utiliza StringBuilder para construir la cadena que contiene las repeticiones de la palabra.
           
           for (int i = 0; i < entero; i++) {
               mensaje.append(palabra).append("\n");
           }
           JOptionPane.showMessageDialog(null, mensaje.toString(), "Repetición de Palabra", JOptionPane.INFORMATION_MESSAGE);
           
           System.exit (0); 
    }
}
