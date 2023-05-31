

public class ImprimirPila {
    void imprimir(int pila[]){
        NumElementos cont = new NumElementos();
        
        int tam = cont.contar(pila);
        
        for(int i=tam-1;i>=0;i--){
            System.out.println(pila[i]);
        }
    }
}
