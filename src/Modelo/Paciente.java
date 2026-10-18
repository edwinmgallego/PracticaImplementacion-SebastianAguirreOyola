/*
*  Creada por: Orlando Arboleda Molina
*  Fecha: 16-Marzo-2022
*
*/
package Modelo;

public class Paciente {
    protected String nombre;
    protected String diaIngreso;
    protected int edad;
    protected Medicamento suMedicamento;

    public Paciente(String nombre, String diaIngreso, int edad, Medicamento suMedicamento) {
        this.nombre = nombre;
        this.diaIngreso = diaIngreso;
        this.edad = edad;
        this.suMedicamento = suMedicamento;
    }
    
    // no modificar
    public double calcularEfectividad()
    {
        return edad-5.5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiaIngreso() {
        return diaIngreso;
    }

    public void setDiaIngreso(String diaIngreso) {
        this.diaIngreso = diaIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Medicamento getSuMedicamento() {
        return suMedicamento;
    }

    public void setSuMedicamento(Medicamento suMedicamento) {
        this.suMedicamento = suMedicamento;
    }
    
    @Override
    public String toString() {
        return "Paciente:" + nombre + "  DiaIngreso:" + diaIngreso+ "  Edad:" + edad + 
                "\n" + suMedicamento;
    }    
}
