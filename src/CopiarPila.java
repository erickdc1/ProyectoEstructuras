

public class CopiarPila {
    int[] copiarPila(int pila[]){
        NumElementos cont = new NumElementos();
        Desapilar leerYquitarCima = new Desapilar();
        
        int tam = cont.contar(pila);
        int copia[] = new int[tam];
        int elem = 0;
        for(int i=tam-1;i>=0;i--){
            elem = leerYquitarCima.eliminar(pila);
            copia[i] = elem;
        }
        
        for(int i=0;i<tam;i++){            
            pila[i] = copia[i];
        }
        
        return copia;
    }
}
