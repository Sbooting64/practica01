/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abarrotesobjetosdominio;

/**
 *
 * @author mildr
 */
public class ProductoGranel {
    
    private float cantidad; 
    
    public ProductoGranel() {
    }

    public ProductoGranel(float cantidad) {
    }

    public ProductoGranel(ProductoGranel otro) {
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ProductoGranel{" + "cantidad=" + cantidad + '}';
    }
    
    
}
