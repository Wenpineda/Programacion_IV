/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.tey;

import javax.swing.JOptionPane;

/**
 *
 * @author cance
 */
class ProductoCongelado extends Producto {
    private double temperatura;

    public ProductoCongelado(int lote, String fechaCaducidad, double temperatura) {
        super(lote, fechaCaducidad);
        this.temperatura = temperatura;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        String info = "Temperatura de Congelación Recomendada: " + temperatura + "°C";
        JOptionPane.showMessageDialog(null, info, "Información del Producto Congelado", JOptionPane.INFORMATION_MESSAGE);
    }
}

