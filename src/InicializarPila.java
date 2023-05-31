

import java.util.Scanner;

public class InicializarPila {
    int[] crear(){
       Scanner sc = new Scanner(System.in);
       int tam; 
       
       System.out.print("Tamano del vector? ");
       tam = sc.nextInt();
       int pila[] = new int[tam];
       
       return pila;
    }
}
