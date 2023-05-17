package ejercicio1;
public class Cuadrado {
    protected double lado1;
    protected double area;
    
    public void calcularArea(){
        area = Math.pow(lado1, 2);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
}
