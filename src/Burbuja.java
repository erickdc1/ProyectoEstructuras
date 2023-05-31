import java.util.Scanner;
public class Burbuja {
    public static void main(String[] args) {
    
        Scanner entrada= new Scanner (System.in);
        Scanner sc= new Scanner(System.in);
        int a,b,c,temp=0;
        String resp;
        
        System.out.println ("INDICA EL NUMERO DE ELEMENTOS DEL ARREGLO ");
        a= sc.nextInt();
        int proyecto []=new int [a];
        
        do
        {
            
            System.out.println("Introduce los numeros para el arreglo ");
            
            for(b=0; b<a; b++)
                proyecto [b]=sc.nextInt();
            
            for (b=1; b<a; b++)
                for (c=0; c<a-1; c++)
                    
                    if (proyecto [c] > proyecto[c+1])
                    {
                        temp = proyecto [c];
                        proyecto[c] = proyecto[c+1];
                    }
        
            
            for (c=0; c<a; c++)
                System.out.print(proyecto [c] + "\n");
            
            System.out.println("\n\tDesea hacer otro arreglo?--s\n");
            resp= entrada.nextLine();
            
        } 
        while (resp.compareTo("s")==0||resp.compareTo("S")==0);
    }
}
