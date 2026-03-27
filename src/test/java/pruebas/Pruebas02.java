/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;
import objetosDominio.*;
import java.time.LocalDate;
/**
 *
 * @author botel
 */
public class Pruebas02 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("EM001", "Atun en Aceite", 'E', "PZ");
        Producto producto2 = new Producto("EM002", "Elotitos Amarillos", 'E', "PZ");
        Producto producto3 = new Producto("EM120", "Chiles Jalapeños", 'E', "PZ");
        Producto producto4 = new Producto("GR001", "Frijol azufrado", 'G', "KG");
        Producto producto5 = new Producto("GR013", "Arroz Grano Largo", 'G', "KG");
        Producto producto6 = new Producto("GR002", "Azúcar Refinada", 'G', "KG");

        System.out.println("--- Lista de Productos ---");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);
        System.out.println(producto6);

        System.out.println("\nNombre del producto 1: " + producto1.getNombre());

        producto5.setNombre("Arroz Grano Corto");

        System.out.println("Producto 5 actualizado: " + producto5);

        if (!producto1.equals(producto1)) {
            System.out.println("Los productos [" + producto1 + "] y [" + producto1 + "] son diferentes.");
        } else {
            System.out.println("Los productos [" + producto1 + "] y [" + producto1 + "] son iguales.");
        }

        if (producto4.equals(producto6)) {
            System.out.println("Los productos [" + producto4 + "] e [" + producto6 + "] son iguales.");
        } else {
            System.out.println("Los productos [" + producto4 + "] e [" + producto6 + "] son diferentes.");
        }

        ProductoEmpacado productoEmpacado1 = new ProductoEmpacado(producto1, 10);
        ProductoEmpacado productoEmpacado2 = new ProductoEmpacado(producto2, 20);

        System.out.println("\n--- Productos Empacados ---");
        System.out.println(productoEmpacado1);
        System.out.println(productoEmpacado2);

        System.out.println("Cantidad de productoEmpacado2: " + productoEmpacado2.getCantidad());

        if (!productoEmpacado1.equals(productoEmpacado2)) {
            System.out.println("Los productos empacados son diferentes: [" + productoEmpacado1 + "] vs [" + productoEmpacado2 + "]");
        }

        ProductoGranel productoGranel1 = new ProductoGranel(producto4, 25.0f);
        ProductoGranel productoGranel2 = new ProductoGranel(producto5, 12.5f);

        System.out.println("\n--- Productos a Granel ---");
        System.out.println(productoGranel1);
        System.out.println(productoGranel2);

        System.out.println("Unidad de productoGranel1: " + productoGranel1.getUnidad());

        if (productoGranel1.equals(productoGranel2)) {
            System.out.println("Los productos a granel son iguales.");
        } else {
            System.out.println("Los productos a granel [" + productoGranel1 + "] y [" + productoGranel2 + "] son diferentes.");
        }

        MovimientoEmpacado movimientoEmpacado1 = new MovimientoEmpacado(LocalDate.now(), false, productoEmpacado1);
        MovimientoEmpacado movimientoEmpacado2 = new MovimientoEmpacado(LocalDate.now().minusDays(1), false, productoEmpacado2);

        System.out.println("\n--- Movimientos Empacados ---");
        System.out.println(movimientoEmpacado1);
        System.out.println(movimientoEmpacado2);

        System.out.println("Cantidad en movimientoEmpacado1: " + movimientoEmpacado1.getProductoEmpacado().getCantidad());

        if (!movimientoEmpacado1.equals(movimientoEmpacado2)) {
            System.out.println("Los movimientos empacados son diferentes.");
        }

        MovimientoGranel movimientoGranel1 = new MovimientoGranel(LocalDate.now(), false, productoGranel1);
        MovimientoGranel movimientoGranel2 = new MovimientoGranel(LocalDate.now().minusDays(1), false, productoGranel2);

        System.out.println("\n--- Movimientos a Granel ---");
        System.out.println(movimientoGranel1);
        System.out.println(movimientoGranel2);

        System.out.println("Fecha de movimientoGranel2: " + movimientoGranel2.getFecha());

        if (movimientoGranel1.equals(movimientoGranel2)) {
            System.out.println("Los movimientos a granel son iguales.");
        } else {
            System.out.println("Los movimientos a granel son diferentes.");
        }
    }
}