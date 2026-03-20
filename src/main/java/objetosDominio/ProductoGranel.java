/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

/**
 *
 * @author mildr
 */
public class ProductoGranel extends Producto{
    
    private float cantidad; 
    
    public ProductoGranel() {
    }

    public ProductoGranel(Producto producto,float cantidad) {
        super(producto); 
        this.setCantidad(cantidad);
    }

    public ProductoGranel(Producto producto) {
        super(producto);
        this.cantidad = 0.0f;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ProductoGranel{" + "cantidad=" + cantidad + '}';
    }
    
    
}
