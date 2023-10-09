/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda.tey;

/**
 *
 * @author cance
 */

import javax.swing.JOptionPane;

public class TiendaTey {
    public static void main(String[] args) {
        String[] opciones = { "Fresco", "Refrigerado", "Congelado" };
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de producto:", "Selección de Producto", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcion == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún tipo de producto.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        int lote = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de lote:"));
        String fechaCaducidad = JOptionPane.showInputDialog("Ingrese la fecha de caducidad:");

        switch (opcion) {
            case 0:
                String fechaEnvasado = JOptionPane.showInputDialog("Ingrese la fecha de envasado:");
                String paisOrigen = JOptionPane.showInputDialog("Ingrese el país de origen:");
                ProductoFresco productoFresco = new ProductoFresco(lote, fechaCaducidad, fechaEnvasado, paisOrigen);
                productoFresco.mostrarInfo();
                break;
            case 1:
                String codigoSupervision = JOptionPane.showInputDialog("Ingrese el código de supervisión:");
                ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(lote, fechaCaducidad, codigoSupervision);
                productoRefrigerado.mostrarInfo();
                break;
            case 2:
                double temperaturaCongelacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura de congelación recomendada (en °C):"));
                ProductoCongelado productoCongelado = new ProductoCongelado(lote, fechaCaducidad, temperaturaCongelacion);
                productoCongelado.mostrarInfo();
                break;
        }
    }
}

