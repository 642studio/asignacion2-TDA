package asign2;

public abstract class Cilindro {
    protected double radio;
    protected double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public abstract double area();     // 2πr(h + r)
    public abstract double volumen();  // πr^2 h

    @Override
    public abstract String toString();
}