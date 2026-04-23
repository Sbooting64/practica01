/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author mildr
 */
public class Movimiento {
    
    private String cveMovimiento;
    private LocalDate fecha;
    private boolean procesado;
    
    //variable encargada de llevar el conteo de movimientos
    private static int contador = 1;
    
    //Constructores
    public Movimiento (){
        
    }
   
    public Movimiento( LocalDate fecha, boolean procesado){
        /* "MV%03d" es una cadena de formato. mv es con lo que comenzara
         * % indica que se inicia a especificar un formato de texto
         * 0 se usa como un relleno, 3 es el ancho minimo que se usara. 
         * por si solo deberia imprimir MV000, pero para eso existe "d",
         * el cual indica que se ingresara un numero decimal al formato
         * se remplazara el ultimo 0 con el numero del contador, dando 
         * de resultado MV001
        */
       try {
            this.cveMovimiento = String.format("MV%03d", contador++);
            setFecha(fecha);
            this.procesado = procesado;
        } catch (Exception ex) {
            System.err.println("error al crear Movimiento: " + ex.getMessage());
            this.cveMovimiento = "MV000";
            this.fecha = null;
            this.procesado = false;
        }
    }
    
    public Movimiento(String cveMoviento){
        try {
            this.cveMovimiento = cveMoviento;
            this.fecha = null;
            this.procesado = false;
        } catch (Exception ex) {
            System.err.println("error al crear Movimiento con clave: " + ex.getMessage());
            this.cveMovimiento = null;
            this.fecha = null;
            this.procesado = false;
        }
    }
    
    
    public String getCveMovimiento(){
        return null;
    }
    
    public void setCveMoviento(String cveMoviento){
        try {
            this.cveMovimiento = cveMoviento;
        } catch (Exception ex) {
            System.err.println("error al asignar clave de movimiento: " + ex.getMessage());
        }
        
    }
    
    public LocalDate getFecha(){
        return fecha;
    }
    
    public void setFecha(LocalDate fecha){
        try {
            this.fecha = fecha;
        } catch (Exception ex) {
            System.err.println("error al asignar fecha: " + ex.getMessage());
            this.fecha = null;
        }
    }
    
    public boolean getProcesado(){
        return false;
    }
    
    public void setProcesado(boolean procesado){
        try {
            this.procesado = procesado;
        } catch (Exception ex) {
            System.err.println("error al asignar procesado: " + ex.getMessage());
            this.procesado = false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movimiento other = (Movimiento) obj;
        return Objects.equals(this.cveMovimiento, other.cveMovimiento);
    }

    @Override
    public String toString() {
        return "Movimiento{" + "cveMovimiento=" + cveMovimiento + ", fecha=" + fecha + ", procesado=" + procesado + '}';
    }
    
    
    
    
}
