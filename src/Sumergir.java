

public class Sumergir {
    int[] sumergir(int pila[], int n){
        NumElementos cont = new NumElementos();
        
        int tam = cont.contar(pila);
        int aux[] = new int[tam+2];
        
        aux[0] = n;
        
        for(int i=1;i<(tam+1);i++){
            aux[i] = pila[i-1];
        }                     
        
        return aux;
    }
}
