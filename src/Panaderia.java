
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
