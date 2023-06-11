package clases;
public class Derpartamento extends Vivienda<Integer, Integer>{
    private String cochera;     //ingresar
    
    @Override
    public double calcularDescuento() {
        descuento = 0.015*ubicacion*precio;
        return descuento;
    }
    
    @Override
    public double calcularAdicionalIncremento() {
        if(cochera.equalsIgnoreCase("Si")){
            switch (valor) {
                case 1: adicIncre = 40000;      break;
                case 2: adicIncre = 35000;      break;
                case 3: adicIncre = 30000;      break;
            }
        }
        return adicIncre;
    }

    public String getCochera() {
        return cochera;
    }

    public void setCochera(String cochera) {
        this.cochera = cochera;
    }   
}
