/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abarrotesobjetosdominio;

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
    
    //Constructores
    public Movimiento (){
        
    }
   
    public Movimiento(String cveMovimiento, Date fecha, boolean procesado){
        
    }
    
    public Movimiento(String cveMoviento){
        
    }
    public Movimiento(Movimiento otro){
        
    }
    
    public String getCveMovimiento(){
        return null;
    }
    
    public void setCveMoviento(String cveMoviento){
        
    }
    
    public Date getFecha(){
        return null;
    }
    
    public void setFecha(Date fecha){
        
    }
    
    public boolean getProcesado(){
        return false;
    }
    
    public void setProcesado(boolean procesado){
        
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
