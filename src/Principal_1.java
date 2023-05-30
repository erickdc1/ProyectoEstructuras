/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Erick DC
 */
public class Principal_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de panes que deseas comprar: ");
        int cantidadDePan = sc.nextInt();

        if (cantidadDePan == 0) {
            System.out.println("¡Gracias por visitar la panadería! ¡Hasta pronto!");
            return; 
        }

        Panaderia pan = new Panaderia();
        int costoTotal = pan.calcularCostoTotal(cantidadDePan);
        System.out.println("El costo total de la compra es: $" + costoTotal);
    }
}
    