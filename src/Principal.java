
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws Exception {
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
                        System.out.println("1. Ordenamiento burbuja");
                        System.out.println("2. Ordenamiento insercion");
                        System.out.println("3. Ordenamiento ShellSort");
                        System.out.println("4. Ordenamiento Mezcla Natural");
                        System.out.println("5. Ordenamiento Radix");
                        System.out.println("6. Ordenamiento Quicksort");
                        System.out.println("7. Ordenamiento Mezcla Directa");
                        System.out.println("8. Ordenamiento Intercalacion");
                        opc = sc.nextInt();
                        switch (opc){
                            case 1:
                                BusqBurbuja burb = new BusqBurbuja();
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
                                break;
                            case 5:
                                Radix radix = new Radix();
                                radix.main(args);
                                break;
                            case 6:
                                Quicksort quick = new Quicksort();
                                quick.main(args);
                                break;
                            case 7:
                                MezclaDirecta mezclaD = new MezclaDirecta();
                                mezclaD.main(args);
                                break;
                            case 8:
                                Intercalacion inter = new Intercalacion();
                                inter.main(args);
                                break;
                        }

                    }
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    System.out.println("MENU: ESTRUCTURAS lineales");
                    System.out.println("----------------------------------");
                    System.out.println("1.Pilas");
                    System.out.println("2.Cola");
                    System.out.println("3.Listas");
                    System.out.println("4.Volver al menu principal");
                    opc = sc.nextInt();
                    System.out.println("----------------------------------");
                    System.out.println("");
                    switch (opc) {  
                        case 1:      
                            Pilas pilas = new Pilas();      
                            pilas.main(args);   
                            break;   
                            case 2:      
                            Colas Colas = new Colas();      
                            Colas.main(args); 
                        case 3:       
                            Listas_enlazadas Listas_enlazadas  = new Listas_enlazadas();       
                            Listas_enlazadas .main(args);       
                            break;   
                        default:      
                            System.out.println("La opción no existe");       
                            break;
                    }                      
                    break;                    
                case 5:
                    System.out.println("Ingresa 1 para la actividad de grafos2 o 2 para la actividad de grafos3");
                    opc = sc.nextInt();
                    switch (opc) {
                        case 1:
                            grafos1 grafo1 = new grafos1(5, 5);
                            grafo1.main(args);
                            break;
                		case 2:
                		Menu grafo2 = new Menu();
                		grafo2.main(args);
                		break;
                		default: System.out.println("Ingresa una opcion valida");
                	}
               
                    break;
                case 6:
                    //5555
                    break;
            }
        }
    }

    private static PrincipalShell PrincipalShell() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static MezclaNatural MezclaNatural() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
