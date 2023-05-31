

public class Decapitar {
    void eliminarCima(int pila[]){
        NumElementos cont = new NumElementos();
        int tam = cont.contar(pila);
        
        pila[tam-1] = -1;
    }
}
