
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Erick DC
 */
public class Principal {

    public static void main(String[] args) {
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
                    boolean sal = false;
                    while (!sal) {
                        System.out.println("Recursividad");
                        System.out.println("1. Ejemlo 1: Recursividad");
                        System.out.println("2. Ejemplo 2: Recursividad Fcatorial");
                        System.out.println("3. Ejemplo 3: Recursividad en una panaderia");
                        System.out.println("4. Salir");
                        opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                Clase_Principal recur = new Clase_Principal();
                                recur.main(args);
                                break;
                            case 2:
                                ClasePrinci fac = new ClasePrinci();
                                fac.main(args);
                                break;
                            case 3:
                                Principal_1 pan = new Principal_1();
                                pan.main(args);
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                        "FIN", JOptionPane.QUESTION_MESSAGE);
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                        "Intente nuevamente", JOptionPane.QUESTION_MESSAGE);

                        }
                    }
                    break;
                case 2:

                    System.out.println("En este partado encontraras un ejemplo de codigo "
                            + "que contiene el metodo de busqueda binaria y secuencial");
                    Pedir_Datos busq = new Pedir_Datos();
                    busq.main(args);

                    break;
                case 3:
                    boolean sali = false;
                    while (!sali){
                        System.out.println("Metodos de ordenamiento");
                        System.out.println("Ordenamiento burbuja");
                        System.out.println("Ordenamiento insercion");
                        System.out.println("Ordenamiento ShellSort");
                        System.out.println("Ordenamiento Mezcla Natural");
                        System.out.println("Ordenamiento Radix");
                        System.out.println("Ordenamiento Quicksort");
                        System.out.println("Ordenamiento Mezcla Directa");
                        System.out.println("Ordenamiento Intercalacion");
                        opc = sc.nextInt();
                        switch (opc){
                            case 1:
                                Burbuja burb = new Burbuja();
                                burb.main(args);
                                break;
                            case 2:
                                Insercion insc = new Insercion();
                                insc.main(args);
                                break;
                            case 3: 
                                PrincipalShell shell = PrincipalShell();
                                shell.main(args);
                                break;
                            case 4: 
                                MezclaNatural mezcla = MezclaNatural();
                                mezcla.main(args);
                        }
                        
                    }
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

    private static PrincipalShell PrincipalShell() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
