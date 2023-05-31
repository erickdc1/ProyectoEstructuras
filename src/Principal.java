
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
                      public class Pilas {

    public static void main(String[] args) throws InterruptedException {
       Scanner sc = new Scanner(System.in);
       InicializarPila inicializar = new InicializarPila();
       Apilar ingresar = new Apilar();
       Desapilar leerYquitarCima = new Desapilar();
       PilaVacia comprobar = new PilaVacia();                  
       ImprimirPila imp = new ImprimirPila();
       NumElementos cont = new NumElementos();
       Cima devolverCima = new Cima();
       Decapitar borrarCima = new Decapitar();
       EliminarPila popPila = new EliminarPila();
       EscribirPila escribirPila = new EscribirPila();   
       CopiarPila copiar = new CopiarPila();
       Sumergir sum = new Sumergir();
       InvertirPila invertir = new InvertirPila();
       Estar estar = new Estar();
       Desfondar desfondar = new Desfondar();
       
       int opc, tamano;
       boolean salir = false;
       int pila[] = new int[1000];
       int tam, n;
       
       
       
        System.out.println("");
        System.out.println("           ---BIENVENIDOS---");
        System.out.println("");
        System.out.println("      ESTRUCTURA DE DATOS --- PILAS");
        System.out.println("");
        System.out.println("");
        
        
        do{
            System.out.println("\t\tMenu         ");
            System.out.println("");
            System.out.println("1.Inicializar Pila");
            System.out.println("2.Apilar");
            System.out.println("3.Desapilar");
            System.out.println("4.Pila Vacia");           
            System.out.println("5.Imprimir Pila");
            System.out.println("6.Numero de elementos de la Pila");
            System.out.println("7.Cima");
            System.out.println("8.Decapitar");
            System.out.println("9.Eliminar Pila");
            System.out.println("10.Escribir Pila");
            System.out.println("11.Copiar Pila");
            System.out.println("12.Sumergir");
            System.out.println("13.Invertir Pila");
            System.out.println("14.Esta");
            System.out.println("15.Fondo");
            System.out.println("16.Salir");
            
            System.out.println("");
            System.out.print("Digite la opcion que desea realizar del menu: ");
            opc = sc.nextInt();
            System.out.println("");
            
            if(opc == 16){
                salir = true;
                break;
            }
            
            switch(opc){
                case 1 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    pila = inicializar.crear();
                    
                    System.out.println("Pila creada satisfactoriamente");
                    
                    Thread.sleep(3000);
               }
                case 2 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    System.out.print("Digite el numero a introducir a la pila: ");
                    n = sc.nextInt();
                    
                    ingresar.introducir(pila, n);
                    
                    Thread.sleep(3000);
               }
                case 3 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    int rescatado = leerYquitarCima.eliminar(pila);
                    
                    System.out.println("Elemento rescatado: " + rescatado);
                    System.out.println("\nElemento eliminado de la cima");
                    
                    Thread.sleep(3000);
               }
                case 4 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    boolean vacia = comprobar.corroborarVacia(pila);
                    
                    if(vacia){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("La pila tiene elementos");
                    }
                    
                    Thread.sleep(3000);
               }
                case 5 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    System.out.println("Elementos de la pila: ");
                    System.out.println("");
                    imp.imprimir(pila);
                    
                    Thread.sleep(4000);
               }
                case 6 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    int t = cont.contar(pila);
                    
                    System.out.println("Total de elementos de la pila: " + t);
                    
                    Thread.sleep(3000);
               }
                case 7 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    int cima = devolverCima.devolverCima(pila);
                    System.out.println("La cima de la pila: " +  cima);
                    System.out.println("");
                    
                    Thread.sleep(3000);
               }
                case 8 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    borrarCima.eliminarCima(pila);
                    System.out.println("Elemento de la cima eliminado");
                    
                    Thread.sleep(3000);
               }
                case 9 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    popPila.elimiarPila(pila);
                    System.out.println("Pila eliminada");
                    
                    Thread.sleep(3000);
               }
                case 10 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    tam = cont.contar(pila);
                    
                    System.out.println("Elemntos de la pila: ");
                    escribirPila.escribir(pila, tam);
                    System.out.println("Elementos eliminados");
                    
                    Thread.sleep(3000);
               }
                case 11 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    tam = cont.contar(pila);
                    int copia[] = new int[tam];
                    copia = copiar.copiarPila(pila);
                    System.out.println("Pila copiada: ");
                    imp.imprimir(copia);
                    
                    Thread.sleep(4000);
               }
                case 12 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    System.out.println("");
                    System.out.print("Digite el numero a introducir en la pila: ");
                    n = sc.nextInt();
                    
                    pila = sum.sumergir(pila, n);
                    
                    System.out.println("Elemento ingresado en la pila");
                    
                    Thread.sleep(3000);
               }
                case 13 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    pila = invertir.invertir(pila);
                    
                    System.out.println("Pila invertida: ");
                    System.out.println("");
                    
                    imp.imprimir(pila);
                    
                    Thread.sleep(3000);
               }
                case 14 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    System.out.print("Digite el numero a buscar: ");
                    n = sc.nextInt();
                    
                    estar.estar(pila, n);
                    
                    Thread.sleep(3000);
               }
                case 15 -> {
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                        /*No hacer nada*/
                    }
                    
                    n = desfondar.desfondar(pila);
                    
                    System.out.println("El numero del fondo de la pila es: " + n);
                    
                    Thread.sleep(3000);
               }
            }
            
            System.out.println("");
        
        }while(salir == false);
               
        sc.close();      
    }

    void main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
                            break;   
                        case 3:       
                            Listas_enlazadas Lista = new Listas_enlazadas();       
                            Lista.main();       
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
