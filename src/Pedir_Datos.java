
import java.util.Scanner;

public class Pedir_Datos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del arreglo: ");
        int num = sc.nextInt();
        int vect[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el numero de la posicion  " + i);
            vect[i] = sc.nextInt();
        }
        System.out.println("Ingrese 1 si quiere la busqueda binaria y 2 si quiere la busqueda secuencial");
        int opc = sc.nextInt();
        if (opc == 1) {
            System.out.println("Ingrese el número que desea buscar: ");
            int x = sc.nextInt();
            Binaria buscar = new Binaria();
            int resultado = buscar.buscar(x, vect);
            if (resultado == -1) {
                System.out.println("El numero no se encontró en el arreglo. ");
            } else {
                System.out.println("El número se encontro en el indice " + resultado);
            }

        } else {
            System.out.println("Ingrese el numero que desea buscar: ");
            int x = sc.nextInt();
            Secuencial secuencial = new Secuencial();
            int resultado = Secuencial.Secuencial(x, vect);
            if (resultado == -1) {
                System.out.println("El número esta en el arreglo. ");
            } else {
                System.out.println("El número se encontro en el indice " + resultado);
            }

        }

    }
}

