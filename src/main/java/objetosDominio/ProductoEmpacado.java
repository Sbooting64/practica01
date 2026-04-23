/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

/**
 *
 * @author mildr
 */
public class ProductoEmpacado extends Producto {
    
    private int cantidad;
    
    public ProductoEmpacado(){
        
    }
    
    public ProductoEmpacado(Producto producto,int cantidad){
        super(producto); 
        try {
            this.setCantidad(cantidad);
        } catch (Exception ex) {
            System.err.println("error al crear ProductoEmpacado: " + ex.getMessage());
            this.cantidad = 0;
        }
    }
    
    public ProductoEmpacado(Producto producto){
        super(producto);
        try {
            this.cantidad = 0;
        } catch (Exception ex) {
            System.err.println("error al crear ProductoEmpacado con producto: " + ex.getMessage());
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        try {
            this.cantidad = cantidad;
        } catch (Exception ex) {
            System.err.println("error al asignar cantidad: " + ex.getMessage());
            this.cantidad = 0;
        }
    }

    @Override
    public String toString() {
        return "ProductoEmpacado{" + "cantidad=" + cantidad + '}';
    }
    
    
    
    
            
            
    
}
