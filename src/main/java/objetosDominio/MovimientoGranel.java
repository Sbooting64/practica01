/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

/**
 *
 * @author mildr
 */
public class MovimientoGranel {
    
    private ProductoGranel productoGranel;
    
    public MovimientoGranel(){
        
    }
            
    public MovimientoGranel(ProductoGranel productoGranel){
        
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
