public class Cilindro {
    private double radio;
    private double altura;

    // Constructor
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    // Área superficial
    public double area() {
        return 2 * Math.PI * radio * (altura + radio);
    }

    // Volumen
    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    // Getters y setters
    public double getRadio() { return radio; }
    public double getAltura() { return altura; }
    public void setRadio(double radio) { this.radio = radio; }
    public void setAltura(double altura) { this.altura = altura; }
}