

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick DC
 */
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
