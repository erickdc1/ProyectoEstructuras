



public class Listas_enlazadas 
{
       private Nodo primero;//creamos un objeto de tipo nodo llamado primero
       private int size; // creamos un atributo de tipo entero llamado size 
       public Listas_enlazadas () //creamos el metodo constructor
       {
           // colocamos el objeto primero y le asignamos null 
       this.primero=null;
       // inicializamos el atributo size
       this.size=0; 
       //creamos el metodo Lista_Vacia para ver si la lista se encuentra vacia :)
       }
       public void Lista_Vacia ()
       {
           //se crea una condicion en la cual si primero es igual a null mostrara que la lista esta vacia
           if(primero == null)
               {
               System.out.println("Mi estimado la lista esta vacia osea no existe osea no hay osea adios");
               }
           //En caso contrario mostrara el mensaje de que la lista tiene datos
           else 
           {
               System.out.println("Mi chavo la lista si tiene datos , prosiga");
           }
       }
       // creamos el metodo añadir nodo
       public void addNodo(int dato)
       {
           //añadimos el nodo y pasamos el parameto dato esto significa que dato se lo pasamos a la clase nodo.
           Nodo nuevo = new Nodo (dato);
           //se declaran 2 variables de tipo nodo :)
           Nodo valor1,valor2;
           //comparamos
           if(primero==null)
           {
               primero=nuevo;
               nuevo.siguiente = null;
           }
           else
           {
               //le asignamos lo del objeto primero al valor 1
               valor1=primero;
               //si valor 1 tiene datos ejecutara todo lo que este dentro del while
               while(valor1!=null)
                   //condicion que verifica si el numero entrante debe de ir al primero
                       {
                   valor2=valor1.siguiente;
                   //evaluamos el dato
                           if(nuevo.dato<=valor1.dato)
                           {
                                nuevo.siguiente=primero;
                                primero=nuevo;
                                break;
                           }
                           else
                           {
                               //condicion que veerifica si el numero entrante debe ir a lo ultimo 
                               if(nuevo.dato>=valor1.dato && valor2 == null)
                               {
                                   valor1.siguiente=nuevo;
                                   nuevo.siguiente=null;
                                   break;
                               }
                               else
                               {
                                   //condicion que verifica si el numero entrante debe ir en medio de otro nodo
                                   if(valor1.dato<nuevo.dato && valor2.dato>= nuevo.dato)
                                   {
                                       //aqui el dato pasa al nuevo nodo esto quiere decir que el nuevo nodo pasa a siguiente.
                                       valor1.siguiente=nuevo;
                                       nuevo.siguiente=valor2;
                                       break;
                                   }
                                   else
                                   {
                                       //pasa al siguiente nodo
                                       valor1 = valor1.siguiente;
                                       
                                   }
                               }
                           }
                       }
               
           }
           /*nuevo.siguiente = primero; //Esto va al primer nodo
           primero = nuevo;//lo coloca de primero*/
           size++;  //colocamos el atributo y lo incrementamos en uno
           
       }
       //metodo que elimina el primer nodo
       public void DeletePrimero()
       {
           primero=primero.siguiente;
           
       }
       public void DeleteUltimo()
       {
           Nodo anterior = primero;
           Nodo actual = primero;
           //recorre todos los nodos de la lista enlazada
           while(actual.siguiente!=null)
                   {
                       //esto significa que elel nodo actual se asigna al actual :) aiudaaaaaaaaaaa
                       anterior=actual;
                       actual = actual.siguiente;
                   }
           anterior.siguiente = null;
                   
       }
       //este elimina uno nodo de la lista que se dese
       public void DeletePosicionNodo(int p)
       {
           Nodo anterior=primero;
           Nodo actual=primero;
           int dato = 0;
           if(p>0)
           {
               while(dato!=p && actual.siguiente!=null)
               {
                   anterior = actual;
                   actual=actual.siguiente;
                   dato++;
               }
               anterior.siguiente=actual.siguiente;
               
                       
           }
       }
       public int size ()//creamos el siguiente metodo para verificar el tamaño que tiene nuestra lista enlazada
       {
          return size; 
       }
       public void Listar()//creamos el siguiente metodo para imprimir niuestra lista enlazada
       {
           Nodo actual = primero; //el primer nodo pasa a actual
           //se evalua el objeto actual y mientras sea distindo a null se ejecura lo demas
           while (actual!=null)
           {
               //mandaremos a llamar el atributo dato que se encuentra en la clase Nodo y simplemente lo mostramos en el mensaje
               System.out.println("["+actual.dato+"]-> ");
               //colocaremos el objeto siguiente de la clase Nodo, queire decir que el nodo actual pasa actual y pasa a siguiente.
               actual = actual.siguiente;
               
           }
       }
       public static void main (String[] args)
       {
           //dentro del metodo principal se manda a llamar a la clase y creamos un objeto el cual tomara el nombre de la clase Listas_enlazadas
           Listas_enlazadas lista = new Listas_enlazadas();
           //Mandamos a llamar al metodo lista vacia
           lista.Lista_Vacia();
           System.out.println("");
           lista.addNodo(1);
           lista.addNodo(2);
           lista.addNodo(3);
           lista.addNodo(4);
           lista.addNodo(5);
           //se manda a llamara al metodo Listar para imprimir la lista enlazada
           lista.Listar();
           //muestra el tamaño de la lista enlazada
           System.out.println("Tamaño"+lista.size());
           System.out.println("");
           //se verifica el resultado de acuerdo al metodo
           lista.DeletePosicionNodo(2);
              lista.Listar();
       }

    void main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

