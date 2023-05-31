

public class PilaVacia {
    boolean corroborarVacia(int pila[]){
        NumElementos cont = new NumElementos();
        
        int tam = cont.contar(pila);
        boolean vacia;
        
        if(tam == 0){
            vacia = true;
        }else{
            vacia = false;
        }
        
        return vacia;
    }
}
