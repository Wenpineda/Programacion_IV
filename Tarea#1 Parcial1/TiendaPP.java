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

//Una tienda ha puesto en oferta la venta de un producto, ofreciendo 15% de descuento por la
//compra de 3 docenas exactas y 10% en caso contrario. Además por la compra de más de 3
//docenas se obsequia una unidad por cada docena en exceso sobre 3. Diseñe un programa
//que determine el monto de la compra, el monto de descuento y el número de unidades de
//obsequio para cada uno de los 10 clientes que se atendieron en el día.

public class TiendaPP {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int cliente = 1; cliente <= 3; cliente++) {
            System.out.println("Cliente #" + cliente);

            System.out.print("Ingrese la cantidad de docenas compradas: ");
            int cantidadDocenas = scanner.nextInt();

            double precioPorDocena = 12.0;
            double montoCompra;
            double descuento;
            int unidadesObsequio = 0;

            // Calcular el descuento y unidades de obsequio
            if (cantidadDocenas >= 3) {
                descuento = cantidadDocenas * precioPorDocena * 0.15; // 15% de descuento por docena
                unidadesObsequio = cantidadDocenas - 3; // 1 unidad por cada docena en exceso sobre 3
            } else {
                descuento = cantidadDocenas * precioPorDocena * 0.10; // 10% de descuento por docena
            }

            // Calcular el monto de la compra
            montoCompra = (cantidadDocenas * precioPorDocena) - descuento;

            // Mostrar resultados al cliente
            System.out.println("Monto de la compra: $" + montoCompra);
            System.out.println("Monto de descuento: $" + descuento);
            System.out.println("Número de unidades de obsequio: " + unidadesObsequio);
            System.out.println();
        }
        scanner.close();
    }
}
