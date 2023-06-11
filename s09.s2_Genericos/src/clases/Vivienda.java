package clases;
public abstract class Vivienda <T, S>{
    protected double precio;    //calcular
    protected double area;      //ingresar
    protected double descuento; //calcular en cada clase
    protected T ubicacion;      //ingresar
    protected S valor;          //ingresar
    protected double adicIncre; //calcular en cada clase
    
    public double calcularPrecio(double tarifa){
        precio = area*tarifa;
        return precio;
    }
    
    public abstract double calcularDescuento();
    
    public abstract double calcularAdicionalIncremento();

    public double calcularPrecioFinal(){
        return precio-descuento+adicIncre;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public T getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(T ubicacion) {
        this.ubicacion = ubicacion;
    }

    public S getValor() {
        return valor;
    }

    public void setValor(S valor) {
        this.valor = valor;
    }

    public double getAdicIncre() {
        return adicIncre;
    }

    public void setAdicIncre(double adicIncre) {
        this.adicIncre = adicIncre;
    }
    
}
