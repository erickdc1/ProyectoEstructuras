
public class Intercalacion {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 1, 3, 6, 8, 4, 7};
        
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        
        mergeSort(arreglo);
        
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }
    
    public static void mergeSort(int[] arreglo) {
        if (arreglo.length <= 1) {
            return;
        }
        
        int mitad = arreglo.length / 2;
        int[] izquierda = new int[mitad];
        int[] derecha = new int[arreglo.length - mitad];
        
        // Llenar los arreglos izquierda y derecha
        for (int i = 0; i < mitad; i++) {
            izquierda[i] = arreglo[i];
        }
        for (int i = mitad; i < arreglo.length; i++) {
            derecha[i - mitad] = arreglo[i];
        }
        
        mergeSort(izquierda);
        mergeSort(derecha);
        merge(arreglo, izquierda, derecha);
    }
    
    public static void merge(int[] arreglo, int[] izquierda, int[] derecha) {
        int i = 0;  // Índice para recorrer el arreglo izquierda
        int j = 0;  // Índice para recorrer el arreglo derecha
        int k = 0;  // Índice para recorrer el arreglo original
        
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k] = izquierda[i];
                i++;
            } else {
                arreglo[k] = derecha[j];
                j++;
            }
            k++;
        }
        
        // Copiar los elementos restantes de izquierda, si los hay
        while (i < izquierda.length) {
            arreglo[k] = izquierda[i];
            i++;
            k++;
        }
        
        // Copiar los elementos restantes de derecha, si los hay
        while (j < derecha.length) {
            arreglo[k] = derecha[j];
            j++;
            k++;
        }
    }
    
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
