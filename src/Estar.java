

public class Estar {
    void estar(int pila[], int n){
        NumElementos cont = new NumElementos();
        
        int tam = cont.contar(pila);
        boolean encontrado = false;
        
        for(int i=0;i<tam;i++){
            if(pila[i] == n){
                encontrado = true;
            }
        }
        
        if(encontrado){
            System.out.println("Elemento encontrado");
        }else{
            System.out.println("");
            System.out.println("Elemento no encontrado");
        }
    }
}
