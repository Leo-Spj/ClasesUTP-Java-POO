package ejercicio1;
public class Vivienda {
    protected double area;        //ingresar
    protected double precio;      //calcular
    protected double adicional;   //calcular en cada clase
    protected double montoFinal;  //calcular
    
    public void calcularMontoFinal(){
        montoFinal=precio+adicional;
    }
    
    public void calcularPrecio(){
        if(area<=100)
            precio=200.00;
        else if(area<=200)
            precio=270.00;
        else
            precio=310.00;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
}
