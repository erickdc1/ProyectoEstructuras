import java.util.Scanner;
public class Insercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int aux = 0, n = 0, j = 0;
        int vect[] = new int[6];
        System.out.println("introduce los valores");
        for (int i = 1; i < 6; i++) {
            vect[i] = sc.nextInt();
        }
        // Llamada al método para ordenar el arreglo
        OrdenamientoInser.insersio(vect);

        for (int i = 1; i < 6; i++) {
            System.out.print(" " + vect[i]);
        }
    }
}
