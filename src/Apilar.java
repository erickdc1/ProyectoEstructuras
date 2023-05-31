


public class Apilar {
    void introducir(int pila[], int n){
        NumElementos cont = new NumElementos();
        
        int tam = cont.contar(pila);
        
        
        if(tam < pila.length){
            pila[tam] = n;
        }else{
            System.out.println("\nPila llena, borre un elemento");
        }
              
    }
}
