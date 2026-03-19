/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abarrotesobjetosdominio;

import java.util.Objects;

/**
 *
 * @author mildr
 */
public class Producto {
    
    private String clave;
    private String nombre;
    private char tipo;
    private String unidad;
    
    public Producto(){
        
    }
    
    public Producto(String clave, String nombre, char tipo, String unidad) {
    }
    
    public Producto(String clave){
        
    }
    
    public Producto(Producto otro){
        
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.clave, other.clave);
    }
    

    @Override
    public String toString() {
        return "Producto{" + "clave=" + clave + ", nombre=" + nombre + ", tipo=" + tipo + ", unidad=" + unidad + '}';
    }
    
    
}
