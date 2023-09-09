/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1.parcial1;

import java.util.Scanner;

/**
 *
 * @author Wendy Liseth Chacon Pineda
 */

//Dado el arreglo de las letras del alfabeto de la A a la Z, hacer un programa en Java que
//ingresando su primer nombre, diga las posiciones de cada letra con respecto al arreglo
//Ejemplo:
//a,b,c,d,e,f,g,h,i,...... x,y,z
//amy
//A posicion 1
//M posicion 13
//Y posicion 26

public class Alfabeto {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu primer nombre: ");
        String nombre = scanner.nextLine().toUpperCase(); // Convertir a mayúsculas para evitar problemas de mayúsculas/minúsculas.

        int[] posiciones = new int[nombre.length()];

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                posiciones[i] = letra - 'A' + 1; // Calcula la posición de la letra en el alfabeto y la almacena en el array.
            } else {
                System.out.println("El carácter '" + letra + "' no es una letra válida.");
            }
        }

        System.out.println("Las posiciones de las letras en el alfabeto son:");
        for (int i = 0; i < posiciones.length; i++) {
            System.out.println(nombre.charAt(i) + ": " + posiciones[i]);
        }

        scanner.close();
    }
}
