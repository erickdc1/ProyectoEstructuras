
public class OrdenamientoBurb {
    public static void burbuja(int[] arreglo) {
        int temp;
        for(int i=1; i<arreglo.length; i++) {
            for(int j=0; j<arreglo.length-1; j++) {
                if(arreglo[j]> arreglo[j+1]) {
                    temp= arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]= temp;
                }
            }
        }
    }
}
