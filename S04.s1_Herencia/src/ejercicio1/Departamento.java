package ejercicio1;

public class Departamento extends Vivienda{
    private int piso;           //ingresar
    private String cochera;     //ingresar
    private double descuento;   //calcular
    
    public void calcularAdicional(){
        if(cochera.equalsIgnoreCase("Si"))
            adicional=35.00;
    }
    
    public void calcularDescuento(){
        if(piso>3)
            descuento=0.03*precio;
    }
    
    @Override
    public void calcularMontoFinal(){
        super.calcularMontoFinal();
        montoFinal=montoFinal-descuento;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCochera() {
        return cochera;
    }

    public void setCochera(String cochera) {
        this.cochera = cochera;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
