package ejercicio1;
public class Casa extends Vivienda{
    private String ubicacion;       //ingresar
    private String amoblado;        //ingresar
    private double incremento;      //calcular
    
    @Override
    public void calcularMontoFinal(){
        super.calcularMontoFinal();
        montoFinal = montoFinal+incremento;
    }
    
    public void calcularIncremento(){
        switch (ubicacion) {
            case "Avenida"  : incremento=0.60*precio;     break;
            case "Jiron"    : incremento=0.50*precio;     break;
            case "Pasaje"   : incremento=0.30*precio;     break;
        }
    }
    
    public void calcularAdicional(){
        if(amoblado.equalsIgnoreCase("Si"))
            adicional=0.03*precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAmoblado() {
        return amoblado;
    }

    public void setAmoblado(String amoblado) {
        this.amoblado = amoblado;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
}
