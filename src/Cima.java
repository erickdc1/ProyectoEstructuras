

public class Cima {
    int devolverCima(int pila[]){
        NumElementos cont = new NumElementos();
        int tam = cont.contar(pila);        
        int cima = pila[tam-1];
        
        return cima;
    }
}
