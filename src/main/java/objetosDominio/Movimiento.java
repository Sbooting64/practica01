/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mildr
 */
public class Movimiento {
    
    private String cveMovimiento;
    private Date fecha;
    private boolean procesado;
    
    //variable encargada de llevar el conteo de movimientos
    private static int contador = 1;
    
    //Constructores
    public Movimiento (){
        
    }
   
    public Movimiento( Date fecha, boolean procesado){
        /* "MV%03d" es una cadena de formato. mv es con lo que comenzara
         * % indica que se inicia a especificar un formato de texto
         * 0 se usa como un relleno, 3 es el ancho minimo que se usara. 
         * por si solo deberia imprimir MV000, pero para eso existe "d",
         * el cual indica que se ingresara un numero decimal al formato
         * se remplazara el ultimo 0 con el numero del contador, dando 
         * de resultado MV001
        */
        this.cveMovimiento = String.format("MV%03d", contador++);
        setFecha(fecha);
        this.procesado = procesado;
    }
    
    public Movimiento(String cveMoviento){
        this.cveMovimiento = cveMovimiento;
        this.fecha = null;
        this.procesado = false;
    }
    
    
    public String getCveMovimiento(){
        return null;
    }
    
    public void setCveMoviento(String cveMoviento){
        this.cveMovimiento=cveMovimiento;
        
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    
    public boolean getProcesado(){
        return false;
    }
    
    public void setProcesado(boolean procesado){
        this.procesado=procesado;
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
