/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barre
 */
public class Mezcla {
    static void mezclar(int i, int j, int a[]) {
        Intercala intercala = new Intercala();
        if (i < j) {
            int m = i + (j - i) / 2;
            mezclar(i, m, a);
            mezclar(m + 1, j, a);
            intercala.intercalar(i, m, j, a);
        }
    }

    
}
