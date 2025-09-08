public class Cilindro {
    private double radio;
    private double altura;

    // Constructor que inicializa radio y altura
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    // Método que regresa el área del cilindro: 2πr(h + r)
    public double area() {
        return 2 * Math.PI * radio * (altura + radio);
    }

    // Método que regresa el volumen del cilindro: πr^2 h
    public double volumen() {
        return Math.PI * radio * radio * altura;
    }

    // Getters y setters (opcionales)
    public double getRadio() { return radio; }
    public double getAltura() { return altura; }
    public void setRadio(double radio) { this.radio = radio; }
    public void setAltura(double altura) { this.altura = altura; }
}