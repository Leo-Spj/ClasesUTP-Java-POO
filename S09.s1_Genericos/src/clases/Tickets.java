package clases;
public abstract class Tickets <T>{
    protected double precio;    //calcular en cada clase
    protected double impuesto;  //calcular
    protected T asientoLugar;   //ingresar
    
    public abstract double calcularPrecio();
    
    public double calcularImpuesto(double totalIng){
        impuesto = 0.11*totalIng;
        return impuesto;
    }
    
    public double calcularPagoFinal(){
        return precio+impuesto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public T getAsientoLugar() {
        return asientoLugar;
    }

    public void setAsientoLugar(T asientoLugar) {
        this.asientoLugar = asientoLugar;
    }
}
