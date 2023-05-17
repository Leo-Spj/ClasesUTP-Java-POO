package ejercicio1;
public class Triangulo extends Rectangulo{
    private double lado3;
    private double sp;
    
    @Override
    public void calcularArea(){
       sp = (lado1+lado2+lado3)/2;
       area = Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3));
    }
    
    public void calcularArea(double angulo){
        area = (double)1/2*lado1*lado2*Math.sin(angulo);
    }
    
    public void calcularArea(double base, double altura){
        area = (base*altura)/2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }
    
}
