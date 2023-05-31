

public class Desapilar {
    int eliminar(int pila[]){
        NumElementos cont = new NumElementos();
        
        int tam = cont.contar(pila);
        
        
        int elem = pila[tam-1];
        pila[tam-1] = -1;
         
         return elem;
    }
}
