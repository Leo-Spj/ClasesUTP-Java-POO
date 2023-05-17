package ejercicio2;

public class Servicios {
    protected double montoPagar;   //Calcula
    protected double tarifa;       //en luz se calcular, en agua se inicializa
    protected double consumo;      //ingresar 
    protected double cargoFijo;    //inicializar

    public Servicios(double cargoFijo) {
        this.cargoFijo = cargoFijo;
    }
    
    public void calcularMontoPagar(){
        montoPagar = (consumo*tarifa)+cargoFijo;
    }
    
    public double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(double montoPagar) {
        this.montoPagar = montoPagar;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getCargoFijo() {
        return cargoFijo;
    }

    public void setCargoFijo(double cargoFijo) {
        this.cargoFijo = cargoFijo;
    }
}
