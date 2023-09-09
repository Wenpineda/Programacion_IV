/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1.parcial1;

import java.util.Scanner;

/**
 *
 * @author cance
 */

//Diseñe un programa en java que calcule los descuentos a un trabajador sabiendo que son
//aplicables un 6.25% del salario en AFP solo si este es superior a $300.00. Además, si es un
//trabajador hombre se le descuenta aparte del AFP, el 3% sobre el sueldo en conceptos de
//ISSS y 10% en concepto de RENTA y si es mujer se le descuenta solamente un 2% en
//concepto de ISSS.
//Tabla de ejemplo
//            Sueldo    AFP     ISSS   Renta  Descuento
//Juan Perez   450    28.125    13.5    45     86.625
//Maria        450    28.125     9      0      37.125

public class Descuentos {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

         // Solicitar al usuario ingresar el salario del trabajador
        System.out.print("Ingrese el salario del trabajador: $");
        double salario = scanner.nextDouble();

         // Solicitar al usuario ingresar el género del trabajador (M para masculino, F para femenino)
        System.out.print("Ingrese el género del trabajador (M para masculino, F para femenino): ");
        char genero = scanner.next().charAt(0);

        // Variables para almacenar los descuentos de AFP, ISSS y RENTA
        double descuentoAFP = 0.0;
        double descuentoISSS = 0.0;
        double descuentoRenta = 0.0;

         // Calcular el descuento de AFP si el salario es mayor a $300
        if (salario > 300.0) {
            descuentoAFP = salario * 0.0625;
        }

        // Calcular los descuentos de ISSS y RENTA según el género del trabajador
        if (genero == 'M') {
            descuentoISSS = salario * 0.03;
            descuentoRenta = salario * 0.10;
        } else if (genero == 'F') {
            descuentoISSS = salario * 0.02;
        }

         // Calcular el salario neto restando los descuentos del salario bruto
        double salarioNeto = salario - descuentoAFP - descuentoISSS - descuentoRenta;

        // Mostrar los descuentos y el salario neto al usuario
        System.out.println("Descuento AFP: $" + descuentoAFP);
        System.out.println("Descuento ISSS: $" + descuentoISSS);
        System.out.println("Descuento RENTA: $" + descuentoRenta);
        System.out.println("Salario Neto: $" + salarioNeto);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
