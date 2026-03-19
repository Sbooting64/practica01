
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author botel
 */

package objetosDominio;


public class Producto {
    private String clave;
    private String nombre;
    private char tipo;
    private String unidad;
    
    

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

 public Producto(){}

    public Producto(String clave, String nombre, char tipo, String unidad) {
        setClave(clave);
        setNombre(nombre);
        setTipo(tipo);
        setUnidad(unidad);
    }

    public Producto(String clave) {
        this.clave = clave;
        this.nombre = null;
        this.tipo = ' ';
        this.unidad = null;
    }

    public Producto(Producto producto) {
        this.clave = producto.clave;
        this.nombre = producto.nombre;
        this.tipo = producto.tipo;
        this.unidad = producto.unidad;
    }
    
    
}
