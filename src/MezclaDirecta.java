
import java.util.Scanner;

public class MezclaDirecta {
    public static void main(String[] args){
        int array[], arrayOrdenado[], arrayDesordenado[], tamañoA;        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño de tu arreglo: ");
        tamañoA = entrada.nextInt();
        array = new int[tamañoA];
        
        ProcesoA eleArray = new ProcesoA();
        arrayDesordenado = eleArray.arregloIngre(array, tamañoA);
        
        ProcesoMD orderMD = new ProcesoMD();
        ResultadoMD mostrarRes = new ResultadoMD();

        arrayOrdenado = orderMD.MezclaDP(arrayDesordenado);
        
        System.out.println("Array Ordenado: ");
        mostrarRes.MostrarArreglo(arrayOrdenado);
    }
}
