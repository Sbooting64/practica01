/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

/**
 *
 * @author botel
 */

public class ProductoEmpacado extends Producto {
    private int cantidad;

    public int getCantidad() { 
        return cantidad; 
    }
    
    public void setCantidad(int cantidad) {}
    public ProductoEmpacado() {}

    public ProductoEmpacado(Producto producto, int cantidad) {
        super(producto);
        this.setCantidad(cantidad);
    }

    public ProductoEmpacado(Producto producto) {
        super(producto);
        this.cantidad = 0;
    }

    

    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
}