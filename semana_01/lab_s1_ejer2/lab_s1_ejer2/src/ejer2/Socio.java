/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author leonardo
 */
public class Socio {
    
    /*Se registran los datos de los socios de un club cuyo pago mensual depende del tipo de categoría:

    Categoría - Pago mensual (S/.) - Descuento (%)
    A - 150 - 10
    B - 130 - 8
    C - 110 - 5

    Asimismo, si tiene más de 20 años como socio del club, recibe el descuento indicado en la tabla
    anterior sobre su pago mensual. Calcular el pago mensual de un socio.
    */

    String nombre;
    char categoria;
    int antiguedad;
    float pagoMensual;
    float descuento;

    Socio(String nombre, char categoria, int antiguedad){
        this.nombre = nombre;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }


    void calcularPagoMensual(){
        switch(categoria){
            case 'A':
                pagoMensual = 150;
                descuento = 10;
                break;
            case 'B':
                pagoMensual = 130;
                descuento = 8;
                break;
            case 'C':
                pagoMensual = 110;
                descuento = 5;
                break;
        }
        if(antiguedad > 20){
            pagoMensual = pagoMensual - (pagoMensual * descuento / 100);
        }
    }

    public String getDatos(){

        return "Nombre: " + nombre +
                " \nCategoria: " + categoria +
                " \nAntiguedad: " + antiguedad +
                " \nPago Mensual: " + pagoMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
