

public class EliminarPila {
    void elimiarPila(int pila[]){
        NumElementos cont = new NumElementos();
        int tam = cont.contar(pila);
        
        for(int i=0;i<tam;i++){
            pila[i] = -1;
        }
    }
}
