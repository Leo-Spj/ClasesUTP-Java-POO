package clases;
public class Concierto extends Tickets<Integer>{

    @Override
    public double calcularPrecio() {
        if(asientoLugar<=50)
            precio = 250;
        else if(asientoLugar<=100)
            precio = 170;
        else
            precio = 120;
        return precio;
    }
    
}
