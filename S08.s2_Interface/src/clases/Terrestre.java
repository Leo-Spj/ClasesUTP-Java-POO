package clases;

import interfaces.Envios;

public class Terrestre extends Transporte implements Envios{
    private double distancia;       //ingresar

    @Override
    public double calcularTotal() {
        return precio+calcularEnvioDomicilio();
    }

    @Override
    public double calcularEnvioDomicilio() {
        if(domicilio.equalsIgnoreCase("Si"))
            return COSTO*distancia;
        else
            return 0;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
}
