package asign2;

import asign2.implementaciones.BolsaImp;
import asign2.implementaciones.CilindroImp;

public class Prueba {
    public static void main(String[] args) {
        // Cilindro
        Cilindro c = new CilindroImp(3, 5);
        System.out.println(c);                          // Cilindro(3.0, 5.0)
        System.out.println("Área: " + c.area());
        System.out.println("Volumen: " + c.volumen());

        // Bolsa
        Bolsa b = new BolsaImp(5);
        b.agrega(10); b.agrega(20); b.agrega(10);
        System.out.println("Num: " + b.obtenNumObjetos()); // 3
        System.out.println("Contiene 10? " + b.contiene(10)); // true
        Sys