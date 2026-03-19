/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosDominio;

/**
 *
 * @author botel
 */
import java.time.LocalDate;

public class Movimiento {
    private String cveMovimiento;
    private LocalDate fecha;
    private boolean procesado;

    public String getCveMovimiento() {
        return cveMovimiento;
    }

    public void setCveMovimiento(String cveMovimiento) {
        this.cveMovimiento = cveMovimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }
    

    
}
