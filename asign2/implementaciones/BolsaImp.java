package asign2.implementaciones;

import java.util.Random;
import asign2.Bolsa;
import asign2.excepciones.BolsaException;

public class BolsaImp extends Bolsa {
    private final Integer[] objetos;
    private final Random rnd = new Random();

    public BolsaImp(int tamBolsa) {
        super(tamBolsa);
        if (tamBolsa < 0) {
            throw new BolsaException("tamBolsa no puede ser negativo");
        }
        this.objetos = new Integer[tamBolsa];
    }

    @Override
    public int obtenNumObjetos() {
        return numObjetos;
    }

    @Override
    public boolean vacia() {
        return numObjetos == 0;
    }

    @Override
    public void agrega(Integer objeto) {
        if (numObjetos >= tamBolsa) {
            throw new BolsaException("La bolsa está llena");
        }
        objetos[numObjetos++] = objeto;
    }

    @Override
    public Integer remueve() {
        if (vacia()) {
            throw new BolsaException("La bolsa está vacía");
        }
        int idx = rnd.nextInt(numObjetos);
        Integer eliminado = objetos[idx];
        // compactar de idx hacia delante
        for (int i = idx + 1; i < numObjetos; i++) {
            objetos[i - 1] = objetos[i];
        }
        objetos[--numObjetos] = null;
        return eliminado;
    }

    @Override
    public Integer remueve(Integer objeto) {
        if (vacia()) {
            throw new BolsaException("La bolsa está vacía");
        }
        int pos = -1;
        for (int i = 0; i < numObjetos; i++) {
            if (objetos[i].equals(objeto)) { pos = i; break; }
        }
        if (pos == -1) return null;
        Integer eliminado = objetos[pos];
        for (int i = pos + 1; i < numObjetos; i++) {
            objetos[i - 1] = objetos[i];
        }
        objetos[--numObjetos] = null;
        return eliminado;
    }

    @Override
    public void limpia() {
        for (int i = 0; i < numObjetos; i++) objetos[i] = null;
        numObjetos = 0;
    }

    @Override
    public int cuenta(Integer objeto) {
        int c = 0;
        for (int i = 0; i < numObjetos; i++) if (objetos[i].equals(objeto)) c++;
        return c;
    }

    @Override
    public boolean contiene(Integer objeto) {
        for (int i = 0; i < numObjetos; i++) if (objetos[i].equals(objeto)) return true;
        return false;
    }

    @Override
    public Integer[] obtenObjetos() {
        Integer[] out = new Integer[numObjetos];
        for (int i = 0; i < numObjetos; i++) out[i] = objetos[i];
        return out;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numObjetos; i++) {
            sb.append(objetos[i]);
            if (i < numObjetos - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}