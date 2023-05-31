
class ShellSort {
    public static void ShellSort(int[] numeros) {
        //asignamos a n los numeros ingresados por el usuario en la clase principal
        int n = numeros.length;
        //aqui se calcula el intervalo inicial, este intervalo siempre se va establecer como la mitad de la matriz
        int intervalo = n / 2;
        //con este while se podra ejecutar la iteracion hasta que llegue a 0
        while (intervalo > 0) {
            // aqui la variable i se inicia en el intervalo calculado de la division de la matriz entre 2
            for (int i = intervalo; i < n; i++) {
                //en la variable temp se va almacenando el valor que va tomando de la matriz 
                int temp = numeros[i];
                int j;
                /*en este for comienza en lo que tenemos en i y de disminuye en lo que tenemos en intervalo
                en este for es donde comparamos los numeros con el elemento del intervalo de las posiciones anteriores
                y se evalua si e numero anterior es mayor se intercambian */
                for (j = i; j >= intervalo && numeros[j - intervalo] > temp; j -= intervalo) {
                    numeros[j] = numeros[j - intervalo];
                }
                //asignamos el nuevo numero en la variable temp para poder repeir el ciclo
                numeros[j] = temp;
            }
            /*por ultimo volvemos a dividir lo que teniamos en intervalo en dos para poder reducir lo que teniamos en intervalo
            asi comparar a los numersÂ¿os que queden mas sercanos*/
            intervalo /= 2;
        }
    }
}
