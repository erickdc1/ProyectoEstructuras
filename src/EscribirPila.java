

public class EscribirPila {
    void escribir(int pila[], int tam){
        PilaVacia vacia = new PilaVacia();
        Desapilar leerYquitarCima = new Desapilar();
        NumElementos cont = new NumElementos();
        
        int elem;
        
        if(!vacia.corroborarVacia(pila)){
            elem = leerYquitarCima.eliminar(pila);
            System.out.println(elem);
            tam = cont.contar(pila);
            escribir(pila, tam);
        }
    }
}
