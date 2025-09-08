public class Prueba {
    public static void main(String[] args) {
        Cilindro c = new Cilindro(3, 5);
        System.out.println("Área: " + c.area());
        System.out.println("Volumen: " + c.volumen());

        Bolsa<String> b = new Bolsa<>(5);
        b.agrega("manzana");
        b.agrega("pera");
        b.agrega("manzana");
        System.out.println("Objetos: " + b.obtenNumObjetos());
        System.out.println("Contiene manzana? " + b.contiene("manzana"));
        System.out.println("Cuenta manzana: " + b.cuenta("manzana"));
        System.out.println("Remueve al azar: " + b.remueve());
    }
}