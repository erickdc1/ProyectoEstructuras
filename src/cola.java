/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author barre
 */
public class cola {
    private NodoCola inicio;
    private NodoCola fin;
    private int tama;

    public cola() {
        inicio = null;
        fin = null;
        tama = 0;
    }
    public int Insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (Vacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
        return 0;
    }
    public boolean Vacia() {
        return inicio == null;
    }
    
    
}
