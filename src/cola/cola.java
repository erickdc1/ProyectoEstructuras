import javax.swing.JOptionPane;

/**
 *
 * @author barre
 */
public class cola {

    private NodoCola inicio;
    private NodoCola fin;
    private int tama;

    public cola() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    public int Insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (Vacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
        return 0;
    }

    public boolean Vacia() {
        return inicio == null;
    }

    public int Quitar() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tama--;
        return aux;
    }

    public int InicioCola() {
        return inicio.dato;
    }

    public int FinCola() {
        return fin.dato;
    }

    public int TamañoCola() {
        return tama;
    }

    public int Tamano() {
        int tama = 0;
        return tama;
    }

    public void invertirCola() {
        if (Vacia()) {
            return;
        }
        NodoCola anterior = null;
        NodoCola actual = inicio;
        NodoCola siguiente = null;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        fin = inicio;
        inicio = anterior;
    }

    public void MostrarCola() {
        NodoCola actual = inicio;
        String mensaje = "";
        while (actual != null) {
            mensaje += actual.dato + " ";
            actual = actual.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Elementos de la cola: " + mensaje);
    }

    public cola copiar() {
        cola copia = new cola();
        NodoCola aux = inicio;
        while (aux != null) {
            copia.Insertar(aux.dato);
            aux = aux.siguiente;
        }
        return copia;
    }

    public void eliminarCola() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar la cola?", "Eliminar cola", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            inicio = null;
            JOptionPane.showMessageDialog(null, "Cola eliminada correctamente.");
        }
    }
}

