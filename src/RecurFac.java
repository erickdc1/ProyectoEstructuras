/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick DC
 */

public class RecurFac {
    public int Factorial (int parametro){
        if(parametro >0){
            int valor_calculado= parametro*Factorial(parametro-1);
            return valor_calculado; 
        }
        return 1;
    }
}
