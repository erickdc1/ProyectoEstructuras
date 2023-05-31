

import java.util.Scanner;

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
    
}
