/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author 106do
 */
public class Colas {

    public static void main(String[] args) {
        cola col = new cola();
        
     
   
        int opcion=0;
        int elemento;
        
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Insertar un elemento en la cola\n"
                + "2. Quitar un elemento de la cola\n"
                +"3.¿La cola se encuentra vacia?\n"
                +"4.Elemento ubicado al inicio de la cola\n"
                +"5.Elemento ubicado al final de la cola\n"
                +"6.Tamaño de la cola\n"
                +"7.Salir", "Menu de opciones de una Cola", JOptionPane.QUESTION_MESSAGE));
            
            switch(opcion){
                case 1:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                          "Ingresa el elemento a insertar" , "Insertando en la cola", JOptionPane.QUESTION_MESSAGE ));
                    col.Insertar(elemento);
                    break;
                case 2:
                    if(!col.Vacia()){
                    JOptionPane.showMessageDialog(null, "El elemento atendido es " + col.Quitar(), 
                            "Quitando Elementos de la cola", JOptionPane.QUESTION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "La cola está vacia", 
                            "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                    }
                break;
                
                case 3:
                   if(col.Vacia()){
                    JOptionPane.showMessageDialog(null, "La cola esta vacia", 
                            "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "La cola NO está vacia", 
                            "Cola NO vacia", JOptionPane.QUESTION_MESSAGE);
                    }
                break;
                
   
                case 4:
                    
                    if(!col.Vacia()){
                    JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de cola es: " + col.InicioCola(),
                            "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                    } else {
                    JOptionPane.showMessageDialog(null, "La cola esta vacia", 
                            "Cola vacia", JOptionPane.QUESTION_MESSAGE);  
                    }
                    
                break;
                
                case 5:
                    if(!col.Vacia()){
                    JOptionPane.showMessageDialog(null, "El elemento ubicado al final de cola es: " + col.FinCola(),
                            "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                    } else {
                    JOptionPane.showMessageDialog(null, "La cola esta vacia", 
                            "Cola vacia", JOptionPane.QUESTION_MESSAGE);  
                    }
                break;
                
                case 6:
                     JOptionPane.showMessageDialog(null, "El tamaño de la cola es:" + col.TamañoCola(),
                            "Tamaño de la cola", JOptionPane.QUESTION_MESSAGE);
                    
                break;
                
                case 7:
                 JOptionPane.showMessageDialog(null, "Aplicacion finalizada", 
                            "FIN", JOptionPane.QUESTION_MESSAGE);
                break;
                
                default:
                     JOptionPane.showMessageDialog(null, "Opcion incorrecta", 
                            "Intente nuevamente", JOptionPane.QUESTION_MESSAGE);
            
            }
                
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" +n.getMessage());
            }
        
        } while (opcion!=5);
        
        
    
}

    static void main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

