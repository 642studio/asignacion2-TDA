import java.util.ArrayList;
import java.util.Random;

public class Bolsa<T> {
    private int tamBolsa;
    private ArrayList<T> objetos;

    // Constructor que inicializa el tamaño máximo de la bolsa
    public Bolsa(int tamBolsa) {
        this.tamBolsa = tamBolsa;
        this.objetos = new ArrayList<>();
    }

    // Obtiene el número de objetos en la bolsa
    public int obtenNumObjetos() {
        return objetos.size();
    }

    // Determina si la bolsa está vacía
    public boolean vacia() {
        return objetos.isEmpty();
    }

    // Agrega un objeto a la bolsa
    public boolean agrega(T objeto) {
        if (objetos.size() < tamBolsa) {
            objetos.add(objeto);
            return true;
        }
        return false;
    }

    // Remueve un objeto al azar
    public T remueve() {
        if (objetos.isEmpty()) return null;
        Random rand = new Random();
        int index = rand.nextInt(objetos.size());
        return objetos.remove(index);
    }

    // Remueve un objeto específico
    public T remueve(T objeto) {
        boolean removed = objetos.remove(objeto);
        return removed ? objeto : null;
    }

    // Limpia la bolsa
    public void limpia() {
        objetos.clear();
    }

    // Cuenta cuántas veces aparece un objeto
    public int cuenta(T objeto) {
        int count = 0;
        for (T o : objetos) {
            if (o.equals(objeto)) count++;
        }
        return count;
    }

    // Verifica si la bolsa contiene un objeto
    public boolean contiene(T objeto) {
        return objetos.contains(objeto);
    }

    // Obtiene los objetos de la bolsa
    public ArrayList<T> obtenObjetos() {
        return new ArrayList<>(objetos);
    }
}