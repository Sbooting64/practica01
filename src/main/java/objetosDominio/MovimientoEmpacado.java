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
public class MovimientoEmpacado extends Movimiento{
    
    private ProductoEmpacado productoEmpacado;
    
    
    
    public MovimientoEmpacado(){
        
    }
    
    public MovimientoEmpacado(LocalDate fecha, boolean procesado, ProductoEmpacado productoEmpacado){
        super(fecha, procesado);
        try {
            this.setProductoEmpacado(productoEmpacado);
        } catch (Exception ex) {
            System.err.println("error al inicializar el producto empacado: " + ex.getMessage());
            this.productoEmpacado = null;
        }
    }
    
    public MovimientoEmpacado(String cveMovimiento){
        super(cveMovimiento);
    }

    public ProductoEmpacado getProductoEmpacado() {
        return productoEmpacado;
    }

    public void setProductoEmpacado(ProductoEmpacado productoEmpacado) {
        try {
            this.productoEmpacado = productoEmpacado;
        } catch (Exception ex) {
            System.err.println("error al asignar producto empacado: " + ex.getMessage());
            this.productoEmpacado = null;
        }
    }

    @Override
    public String toString() {
        return "MovimientoEmpacado{" + "productoEmpacado=" + productoEmpacado + '}';
    }
    
    
    
    
    
    
    
    
}
