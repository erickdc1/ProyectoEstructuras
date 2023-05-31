import java.util.Scanner;
public class Insercion {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner (System.in);
        Scanner sc = new Scanner (System.in);
        
        int aux=0, n=0, j=0;
        int vect[]= new int [6];
        
        System.out.println("Introduce los valores  ");
        
        for (int i=1; i<6; i++)
        {
            vect[i] = sc.nextInt();
        }
        for (int i=1; i<6; i++)
        {
            aux=vect[i];
            j=i-1;
            
            while ((vect[j]<aux)&&(j<=0))
            {
                vect[j+1]=vect[j];
                j--;
                vect[j+1]=aux;
            }
        }
        for (int i=1; i<6; i++)
        {
            System.out.println("Resultado" +vect[i]);
        }
        }
}
