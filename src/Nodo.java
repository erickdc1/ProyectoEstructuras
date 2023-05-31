



public class Nodo
{
    //creamos el atributo  dato y el objeto siguiente
    int dato;
    Nodo siguiente;
    // se crea el metodo constructor y dentro de los parentesis se crea el paramatro de llamado dato 
    public Nodo (int dato)
    {
        // Al atributo dato le asignamos el parametro dato esto significa que el dato que asignamos se lo vamos a dar al parametro dato y al objeto siguiente
        // le asignamos null
        // dato es donde se almacena
        this.dato = dato;
        //siguiente apunta al siguiente nodo de su mismo tipo
        this.siguiente = null;
        
        
    }
    
}
