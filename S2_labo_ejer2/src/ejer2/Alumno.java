/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author Leo
 */
public class Alumno {
    
/* Elaborar un programa que calcule el promedio final de un alumno en base a sus notas de examen
parcial, examen final y el promedio de 2 de sus prácticas que tienen la nota más alta; considere
que el alumno rindió 3 practicas. Además muestre la calificación de acuerdo al siguiente cuadro:

promedio final  / calificacion
0 - 10 / Malo
11 - 13 / Regular
14 - 17 / Bueno
18 - 20 / Excelente
*/

    String calificacion;
    double parcial, final1, practica1, practica2, practica3, promedioPracticas, promedioFinal;

    public Alumno(double parcial, double final1, double practica1, double practica2, double practica3){
        this.parcial = parcial;
        this.final1 = final1;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
    }

    public void calcularPromedioPracticas(){

        double[] practicas = {this.practica1, this.practica2, this.practica3};
        double menorNota = practicas[0];
        for (int i = 0; i < practicas.length; i++) {
            if (practicas[i] < menorNota) {
                menorNota = practicas[i];
            }
        }
        //elimino la nota mas baja
        this.promedioPracticas = (this.practica1 + this.practica2 + this.practica3 - menorNota) / 2;

    }

    public void calcularPromedioFinal(){
        this.promedioFinal = (this.parcial + this.final1 + this.promedioPracticas) / 3;
    }

    void calcularCalificacion(){

        if (this.promedioFinal >= 0 && this.promedioFinal < 11) {
            this.calificacion = "Malo";
        } else if (this.promedioFinal >= 11 && this.promedioFinal < 14) {
            this.calificacion = "Regular";
        } else if (this.promedioFinal >= 14 && this.promedioFinal < 18) {
            this.calificacion = "Bueno";
        } else if (this.promedioFinal >= 18 && this.promedioFinal <= 20) {
            this.calificacion = "Excelente";
        }

    }

    String getReporteFormato() {
        String reporte = "Parcial: " + this.parcial + "\n" +
                "Final: " + this.final1 + "\n" +
                "Practica 1: " + this.practica1 + "\n" +
                "Practica 2: " + this.practica2 + "\n" +
                "Practica 3: " + this.practica3 + "\n" +
                "Promedio de practicas: " + this.promedioPracticas + "\n" +
                "Promedio final: " + this.promedioFinal + "\n\n" +
                "Calificacion: " + this.calificacion;
        return reporte;
    }



}

