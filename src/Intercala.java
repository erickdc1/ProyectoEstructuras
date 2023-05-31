/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barre
 */
class Intercala {
static void intercalar(int i, int m, int j, int a[]) {
        int[] b = new int[a.length]; 
        int p = i, q = m + 1, r = i;
        while (p <= m && q <= j) {
            if (a[p] <= a[q]) {
                b[r++] = a[p++];
            } else {
                b[r++] = a[q++];
            }
        }
        while (p <= m) {
            b[r++] = a[p++];
        }
        for (p = i; p < r; p++) {
            a[p] = b[p];
        }
    }     
}
