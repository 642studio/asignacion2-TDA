package asign2;

import asign2.implementaciones.CilindroImp;
import asign2.implementaciones.BolsaImp;

public class Prueba {
    public static void main(String[] args) {
        // Cilindro
        Cilindro c = new CilindroImp(3, 5);
        System.out.println(c);
        System.out.println("Área: " + c.area());
        System.out.println("Volumen: " + c.volumen());

        // Bolsa
        Bolsa b = new BolsaImp(5);
        b.agrega(10); b.agrega(20); b.agrega(10);
        System.out.println("Num: " + b.obtenNumObjetos());
        System.out.println("Contiene 10? " + b.contiene(10));
        System.out.println("Cuenta(10): " + b.cuenta(10));
        System.out.println("Remueve al azar: " + b.remueve());
        System.out.println("Remueve(20): " + b.remueve(20));
        System.out.println("Objetos: " + b);
    }
}