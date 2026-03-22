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
public class MovimientoEmpacado extends Movimiento{
    
    private ProductoEmpacado productoEmpacado;
    
    
    
    public MovimientoEmpacado(){
        
    }
    
    public MovimientoEmpacado(Date fecha, boolean procesado, ProductoEmpacado productoEmpacado){
        super(fecha, procesado);
        this.setProductoEmpacado(productoEmpacado);
    }
    
    public MovimientoEmpacado(String cveMovimiento){
        super(cveMovimiento);
    }

    public ProductoEmpacado getProductoEmpacado() {
        return productoEmpacado;
    }

    public void setProductoEmpacado(ProductoEmpacado productoEmpacado) {
        this.productoEmpacado = productoEmpacado;
    }

    @Override
    public String toString() {
        return "MovimientoEmpacado{" + "productoEmpacado=" + productoEmpacado + '}';
    }
    
    
    
    
    
    
    
    
}
