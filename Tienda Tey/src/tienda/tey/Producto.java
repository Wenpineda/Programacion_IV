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
class Producto {
    protected final int lote;
    protected final String fechacaducidad;

    public Producto(int lote, String fechaCaducidad) {
        this.lote = lote;
        this.fechacaducidad = fechaCaducidad;
    }

    public void mostrarInfo() {
        String info = "Número de Lote: " + lote + "\nFecha de Caducidad: " + fechacaducidad;
        JOptionPane.showMessageDialog(null, info, "Información del Producto", JOptionPane.INFORMATION_MESSAGE);
    }
}

