/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

import java.util.Date;

/**
 *
 * @author mildr
 */
public class MovimientoGranel extends Movimiento{
    
    private ProductoGranel productoGranel;
    
    public MovimientoGranel(){
        
    }
            
    public MovimientoGranel(Date fecha, boolean procesado, ProductoGranel productoGranel){
        super(fecha, procesado);
        this.setProductoGranel(productoGranel);
    }

    public MovimientoGranel(String cveMovimiento){
        super(cveMovimiento);
    
    }
    
    public ProductoGranel getProductoGranel() {
        return productoGranel;
    }

    public void setProductoGranel(ProductoGranel productoGranel) {
        this.productoGranel = productoGranel;
    }

    @Override
    public String toString() {
        return "MovimientoGranel{" + "productoGranel=" + productoGranel + '}';
    }
    
    
}
