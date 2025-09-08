package asign2.implementaciones;

import asign2.Cilindro;

public class CilindroImp extends Cilindro {

    public CilindroImp(double radio, double altura) {
        super(radio, altura);
        if (radio < 0 || altura < 0) {
            throw new IllegalArgumentException("radio y/o altura no pueden ser negativos");
        }
    }

    @Override
    public double area() {
        return 2 * Math.PI * radio * (altura + radio);
    }

    @Override
    public double volumen() {
        return Math.PI * radio * radio * altura;
    }

    @Override
    public String toString() {
        return "Cilindro(" + radio + ", " + altura + ")";
    }
}