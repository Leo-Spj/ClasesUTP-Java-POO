package clases;
public class Casa extends Vivienda<String, Double>{
    @Override
    public double calcularAdicionalIncremento() {
        switch (ubicacion) {
            case "Residencial": adicIncre = 0.10*precio;     break;
            case "Comercial"  : adicIncre = 0.12*precio;     break;
            default:adicIncre = 0; 
        }
        return adicIncre;
    }
    
    @Override
    public double calcularDescuento() {
        if(valor>(0.40*precio))
            descuento=15000;
        return descuento;
    }
}
