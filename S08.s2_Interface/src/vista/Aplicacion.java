package vista;

import clases.Aereo;
import clases.Terrestre;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aereo a = new Aereo();
        Terrestre t = new Terrestre();
        
        System.out.println("**** Aereo *******");
        System.out.println("Peso del envio");
        a.setPeso(s.nextDouble());
        System.out.println("Va a domicilio?");
        a.setDomicilio(s.next());
        System.out.println("Tiene seguro?");
        a.setSeguro(s.next());
        
        System.out.println("Precio: "+a.calcularPrecio(12, 19, 28, 40));
        System.out.println("Impuesto seguro:" +a.calcularPagoSeguro());
        System.out.println("Pago domicilio: "+a.calcularEnvioDomicilio());
        System.out.println("Pago total: "+a.calcularTotal());
        
        System.out.println("\n********* Terrestre ********");
        System.out.println("Peso del envio");
        t.setPeso(s.nextDouble());
        System.out.println("Va a domicilio?");
        t.setDomicilio(s.next());
        System.out.println("Ingresar distancia");
        t.setDistancia(s.nextDouble());
        
        System.out.println("Precio: "+t.calcularPrecio(5, 7.5, 12, 25));
        System.out.println("Pago domicilio: "+t.calcularEnvioDomicilio());
        System.out.println("Pago total: "+t.calcularTotal());
        
        
    }
    
}
