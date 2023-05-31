
import java.util.Scanner;
 public class Quicksort {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int array[];
int tamaio=8, i;
array = new int[tamaio];
array[0]=11;
array[1]=5;
array[2]=2;
array[3]=6;
array[4]=10;
array[5]=12;
array[6]=8;
array[7]=7;
System.out.println("Array original:");
imprimirArray(array);
quickSort(array, 0, tamaio - 1);
System.out.println("Array ordenado:");
imprimirArray(array);
}
public static void quickSort(int[] array, int izq, int der) {
if (izq >= der) {
return;
}
int pivote = array[(izq + der) / 2];
int i = izq;
int j = der;
System.out.println("");
System.out.println("Pivote:" + pivote);
System.out.println(izq + "," + der);
for(int k=0;k<8;k++){
System.out.print(array[k] + "||");
}
while (i <= j) {
while (array[i] < pivote) {
i++;
}
while (array[j] > pivote) {
j--;
}
if (i <= j) {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
i++;
j--;
}
}
quickSort(array, izq, j);
quickSort(array, i, der);
}
public static void imprimirArray(int[] array) {
for (int i = 0; i < array.length; i++) {
System.out.print(array[i] + " ");
}
System.out.println();
}
}
