package ejercicio1;
public class Regular extends Alumno{
    private String categoria;
    private String seguro;
    
    @Override
    public void calcularPagoMensual() {
        switch (categoria) {
            case "A": pagoMensual = 790.40;         break;
            case "B": pagoMensual = 650.80;         break;
            case "C": pagoMensual = 580.20;         break;
        }
    }

    @Override
    public void calcularIncrementoSegCar() {
        if(seguro.equalsIgnoreCase("Si"))
            incSegCar = 0.02*pagoMensual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }


}
