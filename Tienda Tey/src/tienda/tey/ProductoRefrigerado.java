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
class ProductoRefrigerado extends Producto {
    private String codigo;

    public ProductoRefrigerado(int lote, String fechaCaducidad, String codigo) {
        super(lote, fechaCaducidad);
        this.codigo = codigo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "Código de Supervisión: " + codigo, "Información del Producto Refrigerado", JOptionPane.INFORMATION_MESSAGE);
    }
}



