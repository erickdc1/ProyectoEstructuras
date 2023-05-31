

public class Desfondar {
    int desfondar(int pila[]){
        NumElementos cont = new NumElementos();
        Desapilar desapilar = new Desapilar();
        
        int tam = cont.contar(pila);
        int aux[] = new int[tam];
        int fondo = 0;
        
        for(int i=tam-1;i>=0;i--){
          aux[i] = pila[i];
          fondo =   desapilar.eliminar(pila);
        }
        
        for(int i=tam-1;i>=0;i--){
          pila[i] = aux[i];
          
        }
        
        return fondo;
    }
}
