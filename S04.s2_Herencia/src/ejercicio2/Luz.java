package ejercicio2;
public class Luz extends Servicios{
    private String tipo;        //ingresar
    private double recarga;     //calcular

    public Luz(double cargoFijo) {
        super(cargoFijo);
    }
    
    public void caclularTarifa(){
        switch (tipo) {
            case "Monofásico" : tarifa = 6.00;  break;
            case "Trifásico"  : tarifa = 9.00;  break;    
        }
    }
    
    public void calcularRecarga(){
        recarga = 0.02*(consumo*tarifa);
    }
    
    @Override
    public void calcularMontoPagar(){
        super.calcularMontoPagar();
        montoPagar = montoPagar+recarga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRecarga() {
        return recarga;
    }

    public void setRecarga(double recarga) {
        this.recarga = recarga;
    }
    
}
