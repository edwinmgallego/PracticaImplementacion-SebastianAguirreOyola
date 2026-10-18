/*
*  Creada por: Orlando Arboleda Molina
*  Fecha: 16-Marzo-2022
*
*/
package Modelo;

public class Medicamento {
    private String nombre;
    private double dosis;

    public Medicamento(String nombre, double dosis) {
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento:" + nombre + "  Dosis:" + dosis;
    }    
}
