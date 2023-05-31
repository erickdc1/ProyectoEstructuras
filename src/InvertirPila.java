

public class InvertirPila {
    int[] invertir(int pila[]){
        NumElementos cont = new NumElementos();
        Desapilar desapilar = new Desapilar();
        Sumergir sumergir = new Sumergir();
        
        int tam = cont.contar(pila);
        int aux[] = new int[tam];
        int elem = 0;
        
        for(int i=0;i<tam;i++){
            elem = desapilar.eliminar(pila);
            aux[i] = elem;
            sumergir.sumergir(aux, elem);
        }
        
        return aux;
    }
}
