
import java.util.Arrays;
public class ProcesoMD {
    public int [] MezclaDP(int [] arreglo){
        int i, j, k;
        
        if(arreglo.length > 1){
            int nElementosIzq = arreglo.length/2;
            int nElementosDer = arreglo.length - nElementosIzq;
            
            //"Arrays.copyOfRange" para crear los arreglos izquierdo y derecho.
            
            int arregloIzq[] = Arrays.copyOfRange(arreglo, 0, nElementosIzq);
            int arregloDer[] = Arrays.copyOfRange(arreglo, nElementosIzq, arreglo.length);
            
            //Recursividad
            arregloIzq = MezclaDP(arregloIzq);
            arregloDer = MezclaDP(arregloDer);
            
            i=0;
            j=0;
            k=0;
            
            while(arregloIzq.length != j && arregloDer.length != k){
                if(arregloIzq[j] < arregloDer[k]){  //i se agrra para array principal, j para arregloizq y k para arregloDer
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                }
                else{
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            //Arreglo final
            while(arregloIzq.length != j){
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while(arregloDer.length != k){
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }
        //fin del else
        return arreglo;
    }
}
