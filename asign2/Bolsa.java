package asign2;

public abstract class Bolsa {
    protected int tamBolsa;
    protected int numObjetos;

    public Bolsa(int tamBolsa) {
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
    }

    public abstract int obtenNumObjetos();
    public abstract boolean vacia();
    public abstract void agrega(Integer objeto);         // lanza si está llena
    public abstract Integer remueve();                   // al azar; lanza si vacía
    public abstract Integer remueve(Integer objeto);     // null si no existe; lanza si vacía
    public abstract void limpia();
    public abstract int cuenta(Integer objeto);
    public abstract boolean contiene(Integer objeto);
    public abstract Integer[] obtenObjetos();
    @Override
    public abstract String toString();
}