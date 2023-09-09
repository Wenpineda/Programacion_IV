/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1.parcial1;

import javax.swing.JOptionPane;

/**
 * @author cance
 */

//Escribir un programa en Java, que ingresado el radio de una circunferencia, calcule
//el área utilizando la fórmula a = pi X r X r.
//y volumen tomando en cuenta la fórmula del área de un círculo (4/3) X pi X r X r X r
//Nota, utilizar una constante para calcular el valor de pi de al menos 10 posiciones
//decimales 3.1415926535

public class AreaCircunferencia {
    
     public static void main(String[] args) {
        double Radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del Radio de la Circunferencia: "));

        double Area;
        double Volumen;
        double Pi =  3.1415926535;
        
        //estamos utilizando Math.PI de la clase Math
        //para obtener el valor de pi y Math.pow(base, exponente) para elevar el radio al cuadrado.
        Area = Pi* Math.pow(Radio, 2);
        Volumen = 1.33 *(Pi* Math.pow(Radio,3)); //1.33 = 4/3, lo puse asi porque no me funcionaba con el 4/3 
       
        JOptionPane.showMessageDialog(null, "El Area de la Circunerencia es: " + Area + " cm " + 
                " \ny su Volumen es de: " + Volumen + " cm ","Resultados", JOptionPane.PLAIN_MESSAGE );
        
        System.exit (0);
   }
}