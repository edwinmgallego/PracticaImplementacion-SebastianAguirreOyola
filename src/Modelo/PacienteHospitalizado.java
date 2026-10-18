/*
*  Creada por: Orlando Arboleda Molina
*  Fecha: 16-Marzo-2022
*
*/
package Modelo;

public class PacienteHospitalizado extends Paciente {

    private double peso;

    public PacienteHospitalizado(String nombre, String diaIngreso, int edad, Medicamento suMedicamento, double peso) {
        super(nombre, diaIngreso, edad, suMedicamento);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularAtencion() {
        if (peso > 35) {
            return edad / 10.0;
        } else {
            return edad / 8.0;
        }
    }

    public String calcularAtencion(String clinica) {

        if (clinica.equals("ValleLili")) {
            return "ALTA";
        }

        if (suMedicamento.getDosis() > 2.5) {
            return "REGULAR";
        } else {
            return "MALA";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "  Peso: " + peso;
    }
}