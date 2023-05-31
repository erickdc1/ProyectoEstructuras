import java.util.Scanner;
public class MezclaNatural {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        Mezcla mezcla = new Mezcla();
        System.out.println("Indica el numero de elementos del arreglo");
        
        int n=sc.nextInt();
        
        int a[]=new int [n];
        n = a.length;
        
        System.out.println("Introduce los numeros para tu arreglo");
        for(int b=0;b<n;b++){
            a[b]=sc.nextInt();
        }
        
        System.out.println("");
        System.out.print("Vector sin ordenar: ");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        mezcla.mezclar(0, a.length - 1, a);
        
        System.out.println("");
        System.out.print("Vector ordenado: ");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.println("");        
    }
}
