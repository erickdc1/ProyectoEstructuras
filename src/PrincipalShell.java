
import java.util.Scanner;
public class PrincipalShell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Aqui pedimos el tamaÃ±o de la matriz
        System.out.print("Ingrese el tamaÃ±o de la matriz: ");
        int n = sc.nextInt();
        //aqui asignamos el tamaÃ±o que ingreso el usuario a el arreglo llamado numeros
        int numeros []= new int[n];
        //Se procede a ingresar los numeros del arreglo
        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        //aqui se manda a llamar el metodo donde esta ordenando la matriz
        ShellSort.ShellSort(numeros);
        //se imprime la matriz ordenada
        System.out.println("Matriz ordenada:");
        Imprimir.imprimir(numeros);
    }
}
