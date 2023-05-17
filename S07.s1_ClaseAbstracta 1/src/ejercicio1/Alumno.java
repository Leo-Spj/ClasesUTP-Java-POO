package ejercicio1;
public abstract class Alumno {
    protected double pagoMensual;   //calcular en cada clase
    protected double incSegCar;     //calcular en cada clase
    protected double adicional;     //calcular
    protected double totalPago;     //calcular
    protected String ingles;        //ingresar
    
    public void calcularPagoTotal(){
        totalPago = pagoMensual+incSegCar+adicional;
    }
    
    public void calcularAdicional(){
        if(ingles.equalsIgnoreCase("Si"))
            adicional = 75.20;
    }
    
    public abstract void calcularPagoMensual();
    
    public abstract void calcularIncrementoSegCar();

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public double getIncSegCar() {
        return incSegCar;
    }

    public void setIncSegCar(double incSegCar) {
        this.incSegCar = incSegCar;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }
    
}
