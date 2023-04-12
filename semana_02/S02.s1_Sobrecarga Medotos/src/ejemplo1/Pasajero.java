package ejemplo1;
public class Pasajero {
    private double precio;
    private double peso;
    private double incremento;
    private double adicional;
    private double montoFinal;
    private String refrigerio;

    public Pasajero() {
        adicional = 35.00;
    }

    public Pasajero(double adicional) {
        this.adicional = adicional;
    }    
   
    public void calcularMontoFinal(){
        montoFinal = precio+incremento+adicional;
    }
    
    public void calcularIncremento(){
        if(peso<=20)
            incremento=0;
        else if(peso<=40)
            incremento=0.05*precio;
        else if(peso<=60)
            incremento=0.10*precio;
        else
            incremento=0.15*precio;
    }
    
    public void calcularAdicional(){
        if(refrigerio.equalsIgnoreCase("no"))
            adicional = 0.00;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getRefrigerio() {
        return refrigerio;
    }

    public void setRefrigerio(String refrigerio) {
        this.refrigerio = refrigerio;
    }
    
    
}
