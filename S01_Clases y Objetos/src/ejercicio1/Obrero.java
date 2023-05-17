package ejercicio1;
public class Obrero {
    private String categoria;
    private String tipoProd;
    private int unidades;
    private double tarifa;
    private double bonificacion;
    private double descuento;
    private double ingresoTotal;
    private double pagoFinal;
    
    public void calcularPagoFinal(){
        pagoFinal = ingresoTotal - descuento;
    }
    
    public void calcularIngresoTotal(){
        ingresoTotal = (tarifa*unidades)+bonificacion;
    }
    
    public void calcularDescuento(){
        descuento = 0.07*ingresoTotal;
    }
    
    public void calcularBonificacion(){
        if(unidades<=250)
            bonificacion=0;
        else if(unidades<=500)
            bonificacion=50;
        else if(unidades<=1000)
            bonificacion=100;
        else 
            bonificacion=150;
    }
    public void calcularTarifa(){
        switch (categoria) {
            case "A":   switch (tipoProd) {
                            case "Tejas": tarifa = 2.50;        break;
                            case "Losetas": tarifa = 2.00;        break;    

                        } break;
            case "B":   switch (tipoProd) {
                            case "Tejas": tarifa = 2.00;        break;
                            case "Losetas": tarifa = 1.50;        break;    

                        } break;
            case "C":   switch (tipoProd) {
                            case "Tejas": tarifa = 1.50;        break;
                            case "Losetas": tarifa = 1.00;        break;    

                        } break;
            
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIngresoTotal() {
        return ingresoTotal;
    }

    public void setIngresoTotal(double ingresoTotal) {
        this.ingresoTotal = ingresoTotal;
    }

    public double getPagoFinal() {
        return pagoFinal;
    }

    public void setPagoFinal(double pagoFinal) {
        this.pagoFinal = pagoFinal;
    }
    
    
}
