
import java.util.ArrayList;
 public class Radix {
    public static void main(String[] args) {
        //DeclaraciÃ³n de variables
        int[] arreglo = new int[] { 78, 12, 53, 14, 01, 943, 50, 677, 33, 100 }; //10 elementos en el arreglo
        radixSort(arreglo);
        imprimirArreglo(arreglo);
    }
 
    public static void radixSort(int[] arreglo) {
        int digito = tomarMaxDigito (arreglo); // obtiene el nÃºmero mÃ¡ximo de dÃ­gitos en el arreglo
        for (int i = 0; i < digito; i++) {
                         bucketSort (arreglo, i); // ordena bucketSort por dÃ­gitos veces
        }
    }
 
    public static int tomarMaxDigito(int[] arreglo) {
                 int digito = 1; // el valor predeterminado es solo un dÃ­gito
                 int base = 10; // Cada dÃ­gito adicional en decimal significa que su valor es 10 veces mayor
        for (int i : arreglo) {
            while (i > base) {
                digito++;
                base *= 10; //Realiza multiplicaciÃ³n y asigna
            }
        }
        return digito;
    }
 
    public static void bucketSort(int[] arreglo, int digito) {
        int base = (int) Math.pow(10, digito);
        // init buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
                 for (int i = 0; i <10; i ++) {// Solo hay diez nÃºmeros del 0 al 9, asÃ­ que prepara diez cubos o baldes
            buckets.add(new ArrayList<>());
        }
        // algortimo
        for (int i : arreglo) {
            int index = i / base % 10; //Resto o mÃ³dilo
            buckets.get(index).add(i);
        }
        // Regresa valores al arreglo
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int i : bucket) {
                arreglo[index++] = i;
            }
        }
    }
 
    public static void imprimirArreglo(int[] arreglo) {
    //El mÃ©todo imprime el arreglo ordenado
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
 

}
