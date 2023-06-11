package clases;
public class Teatro extends Tickets<String>{
    private String preferencial;
    private double incremento;

    @Override
    public double calcularPrecio() {
        switch (asientoLugar) {
            case "Descampado": precio = 36.00;       break;
            case "Cerrado"   : precio = 42.00;       break;
        }
        return precio;
    }
    
    public double calcularIncremento(){
        if(preferencial.equalsIgnoreCase("si"))
            incremento = 10.00;
        return incremento;
    }
    
    @Override
    public double calcularPagoFinal(){        
        return super.calcularPagoFinal()+incremento;
    }

    public String getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(String preferencial) {
        this.preferencial = preferencial;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
}
