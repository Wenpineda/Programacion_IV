package com.mycompany.primerguia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WENDY LISETH CHACON PINEDA
 * 
 * Escribe un programa que ingrese su nobre y apelido 
 * por separado y se imprima el resultado junto a la fecha actual 
 * Ejemplo: Juan Perez 21 agosto 2023.
 */

import java.util.*;
import javax.swing.JOptionPane;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        String Nombre;
        
                Nombre = JOptionPane.showInputDialog("Ingrese su Nombre y Apellido: ");
        
        JOptionPane.showMessageDialog(null, "Su Nombre es: " + Nombre + " ," + (new Date()) ,
        "Resultados", JOptionPane.PLAIN_MESSAGE );
        
        System.exit (0); 
    }
}
 