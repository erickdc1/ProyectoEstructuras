
public class OrdenamientoInser {
    public static void insersio(int[] arreglo) {
        int aux = 0, j = 0;
        for (int i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            j = i - 1;
            while ((arreglo[j] > aux) && (j >= 0)) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
    }
    
}
