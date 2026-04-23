/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

import java.time.LocalDate;


/**
 *
 * @author mildr
 */
public class MovimientoGranel extends Movimiento{
    
    private ProductoGranel productoGranel;
    
    public MovimientoGranel(){
        
    }
            
    public MovimientoGranel(LocalDate fecha, boolean procesado, ProductoGranel productoGranel){
        super(fecha, procesado);
        try {
            this.setProductoGranel(productoGranel);
        } catch (Exception ex) {
            System.err.println("error al inicializar el producto granel: " + ex.getMessage());
            this.productoGranel = null;
        }
    }

    public MovimientoGranel(String cveMovimiento){
        super(cveMovimiento);
    
    }
    
    public ProductoGranel getProductoGranel() {
        return productoGranel;
    }

    public void setProductoGranel(ProductoGranel productoGranel) {
        try {
            this.productoGranel = productoGranel;
        } catch (Exception ex) {
            System.err.println("error al asignar producto granel: " + ex.getMessage());
            this.productoGranel = null;
        }
    }

    @Override
    public String toString() {
        return "MovimientoGranel{" + "productoGranel=" + productoGranel + '}';
    }
    
    
}
