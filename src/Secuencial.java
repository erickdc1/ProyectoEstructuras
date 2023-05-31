
public class Secuencial {

    public static int Secuencial(int x, int vect[]) {
        //int j = 0;
        int n = vect.length;

        for (int j = 0; j < n; j++) {
            if (x == vect[j]) {
                return j;
            }
        }

        return -1;
    }

}
