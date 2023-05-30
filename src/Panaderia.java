/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick DC
 */

public class Panaderia  {
    public int calcularCostoTotal(int cantidadDePan) {
        int pre = 3; 
        if (cantidadDePan == 0) {
            return 0;
        } else {
            return pre + calcularCostoTotal(cantidadDePan - 1);
        }
    }
}
