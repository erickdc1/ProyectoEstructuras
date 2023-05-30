

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick DC
 */
public class Binaria {
    public static int buscar(int num, int vect[]) {
        int izq, der, cen;
        izq = 0;der = vect.length - 1;
        while (izq <= der) {
            cen = (izq + der) / 2;
            if (vect[cen] == num) {
                return cen;
            }
            if (num > vect[cen]) {
                izq = cen + 1;
            } else {
                der = cen - 1;
            }
        }
        return -1;
    }
    
}

