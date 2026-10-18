/*
*  Creada por: Orlando Arboleda Molina
*  Fecha: 16-Marzo-2022
*
*/
package Modelo;

public class PacienteAmbulatorio extends Paciente {

    private int diasCasa;

    public PacienteAmbulatorio(String nombre, String diaIngreso,int edad, Medicamento suMedicamento, int diasCasa) {
        super(nombre, diaIngreso, edad, suMedicamento);
        this.diasCasa = diasCasa;
    }

    public int getDiasCasa() {
        return diasCasa;
    }

    public void setDiasCasa(int diasCasa) {
        this.diasCasa = diasCasa;
    }

    @Override
    public double calcularEfectividad() {
        return super.calcularEfectividad() * 0.90;
    }

    @Override
    public String toString() {
        return super.toString() + "  Dias en casa: " + diasCasa;
    }
}