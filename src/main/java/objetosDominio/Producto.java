/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

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
        try {
            this.setClave(clave);
            this.setNombre(nombre);
            this.setTipo(tipo);
            this.setUnidad(unidad);
        } catch (Exception ex) {
            System.err.println("error al crear Producto: " + ex.getMessage());
            this.clave = null;
            this.nombre = null;
            this.tipo = ' ';
            this.unidad = null;
        }
    }
    
    public Producto(String clave){
        try {
            this.clave = clave;
            this.nombre = null;
            this.tipo = ' ';
            this.unidad = null;
        } catch (Exception ex) {
            System.err.println("error al crear Producto con clave: " + ex.getMessage());
            this.clave = null;
            this.nombre = null;
            this.tipo = ' ';
            this.unidad = null;
        }
    }
    
    public Producto(Producto producto){
        try {
            this.clave = producto.getClave();
            this.nombre = producto.getNombre();
            this.tipo = producto.getTipo();
            this.unidad = producto.getUnidad();
        } catch (Exception ex) {
            System.err.println("error al copiar Producto: " + ex.getMessage());
            this.clave = null;
            this.nombre = null;
            this.tipo = ' ';
            this.unidad = null;
        }
        
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
        try {
            this.clave = clave;
        } catch (Exception ex) {
            System.err.println("error al asignar clave: " + ex.getMessage());
        }
    }

    public void setNombre(String nombre) {
        try {
            this.nombre = nombre;
        } catch (Exception ex) {
            System.err.println("error al asignar nombre: " + ex.getMessage());
        }
    }

    public void setTipo(char tipo) {
        try {
            this.tipo = tipo;
        } catch (Exception ex) {
            System.err.println("error al asignar tipo: " + ex.getMessage());
            this.tipo = ' ';
        }
    }

    public void setUnidad(String unidad) {
        try {
            this.unidad = unidad;
        } catch (Exception ex) {
            System.err.println("error al asignar unidad: " + ex.getMessage());
        }
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
