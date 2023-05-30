/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Erick DC
 */
public class ClasePrinci {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero para calcular su factorial: ");
        int numero = sc.nextInt();
        RecurFac recursividad = new RecurFac();
        int factorial= recursividad.Factorial(numero);
        
        System.out.println("El factorial de "+ numero + " es " + factorial);
        
    }
    
}
