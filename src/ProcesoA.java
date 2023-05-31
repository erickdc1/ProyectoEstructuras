
import java.util.Scanner;

public class ProcesoA {
   public int[] arregloIngre(int [] array, int tamañoA){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los elementos de tu arreglo: ");
        for(int i=0;i<tamañoA;i++){
            array[i] = entrada.nextInt();
        }
        return array;
    } 
}
