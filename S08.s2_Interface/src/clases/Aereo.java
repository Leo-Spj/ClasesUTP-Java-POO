package clases;

import interfaces.Adicionales;
import interfaces.Envios;

public class Aereo extends Transporte implements Adicionales, Envios{
    private String seguro;  //ingresar

    @Override
    public double calcularTotal() {
        return precio+IMPUESTO_AEREO+calcularPagoSeguro()+calcularEnvioDomicilio();
    }
    
    @Override
    public double calcularPagoSeguro() {
        if(seguro.equalsIgnoreCase("Si"))
            return IMPUESTO_SEGURO;
        else
            return 0;
    }

    @Override
    public double calcularEnvioDomicilio() {
        if(domicilio.equalsIgnoreCase("Si"))
            return COSTO*peso;
        else
            return 0;
    }
    
    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
}
