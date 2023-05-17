package ejercicio1;
public class PorCredito extends Alumno{
    private int cantCreditos;   //ingresar

    @Override
    public void calcularPagoMensual() {
        pagoMensual = cantCreditos*45.10;
    }

    @Override
    public void calcularIncrementoSegCar() {
        if(cantCreditos>10)
            incSegCar = 18.00;
    }
    
    public int getCantCreditos() {
        return cantCreditos;
    }

    public void setCantCreditos(int cantCreditos) {
        this.cantCreditos = cantCreditos;
    }


}
