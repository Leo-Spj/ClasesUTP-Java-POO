package clases;
public abstract class Transporte {
    protected double precio;    //calcular
    protected double peso;      //ingresar
    protected String domicilio; //ingresar

    public double calcularPrecio(double p1, double p2, double p3, double p4){
        if(peso<=1000)
            precio = p1;
        else if(peso<=3500)
            precio = p2;
        else if(peso<=5000)
            precio = p3;
        else 
            precio = p4;
        return precio;
    }
    
    public abstract double calcularTotal();
    
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
