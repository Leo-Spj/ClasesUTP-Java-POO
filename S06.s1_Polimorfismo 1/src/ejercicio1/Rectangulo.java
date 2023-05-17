package ejercicio1;
public class Rectangulo extends Cuadrado{
    protected double lado2;
    
    @Override
    public void calcularArea(){
        area = lado1*lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
