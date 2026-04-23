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
        try {
            this.setCantidad(cantidad);
        } catch (Exception ex) {
            System.err.println("error al crear ProductoGranel: " + ex.getMessage());
            this.cantidad = 0.0f;
        }
    }

    public ProductoGranel(Producto producto) {
        super(producto);
        try {
            this.cantidad = 0.0f;
        } catch (Exception ex) {
            System.err.println("error al crear ProductoGranel con producto: " + ex.getMessage());
            this.cantidad = 0.0f;
        }
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        try {
            this.cantidad = cantidad;
        } catch (Exception ex) {
            System.err.println("error al asignar cantidad: " + ex.getMessage());
            this.cantidad = 0.0f;
        }
    }

    @Override
    public String toString() {
        return "ProductoGranel{" + "cantidad=" + cantidad + '}';
    }
    
    
}
