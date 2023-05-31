
import java.util.Scanner;
public class BusqBurbuja {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        String resp;
        System.out.println("Indica el numero de elementos del arreglo");
        a=sc.nextInt();
        int proyecto[]= new int [a];
        do{
            System.out.println("Introduce los numeros para tu arreglo");
            for(b=0; b<a; b++) {
                proyecto[b]=sc.nextInt();
            }
            // Llamada al método para ordenar el arreglo
            OrdenamientoBurb orderbur = new OrdenamientoBurb();
            orderbur.burbuja(proyecto);
            
            //order.burbuja(proyecto);

            for(c=0;c<a;c++) {
                System.out.print(" "+proyecto[c]);
            }
            System.out.println("desea hacer otro arreglo?    s/n");
            resp=entrada.nextLine();
        } while (resp.compareTo("s") == 0 || resp.compareTo("S") == 0);
    }
}
