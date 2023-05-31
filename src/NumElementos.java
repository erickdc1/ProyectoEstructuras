

public class NumElementos {
    int contar(int pila[]){
        int tam = 0;
        
        for(int i=0;i<pila.length;i++){
            if(pila[i] > 0){
                tam++;
            }
        }
        
        return tam;
    }
}
