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
class ProductoFresco extends Producto {
    private String fechaenvasado;
    private String paiserigen;

    public ProductoFresco(int lote, String fechaCaducidad, String fechaEnvasado, String paisOrigen) {
        super(lote, fechaCaducidad);
        this.fechaenvasado = fechaEnvasado;
        this.paiserigen = paisOrigen;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        String info = "Fecha de Envasado: " + fechaenvasado + "\nPaís de Origen: " + paiserigen;
        JOptionPane.showMessageDialog(null, info, "Información del Producto Fresco", JOptionPane.INFORMATION_MESSAGE);
    }
}
