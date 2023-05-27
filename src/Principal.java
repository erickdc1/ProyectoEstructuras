
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick DC
 */
public class Principal {
    public static void main(String [] args){
        int opc;
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
        while (!salir) {
            System.out.println("Proyecto Final Estructuras");
            System.out.println("Temas del semestre");
            System.out.println("Eliga un tema");
            System.out.println("1. Recursividad");
            System.out.println("2. Metodos de busqueda");
            System.out.println("3. Metodos de ordenamiento");
            System.out.println("4. Estructuras lineales");
            System.out.println("5. Grafos");
            System.out.println("6. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    boolean sal = false;
                    while (!sal) {
                        System.out.println("Metodos de busqueda");
                        System.out.println("Eliga un tema");
                        System.out.println("1. Busqueda Secuencial");
                        System.out.println("2. Busqueda Binaria");
                        opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
