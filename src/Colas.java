import javax.swing.JOptionPane;
public class Colas 
{
        int opcion = 0;
        int elemento;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                            1.Insertar un elemento en la cola
                                                                            2. Quitar un elemento de la cola
                                                                            3.\u00bfLa cola se encuentra vacia?
                                                                            4.Elemento ubicado al inicio de la cola
                                                                            5.Elemento ubicado al final de la cola
                                                                            6.Tama\u00f1o de la cola
                                                                            7.Invertir Cola
                                                                            8.Imprimir la cola actual
                                                                            9.Copiar Cola
                                                                            10.Eliminar todos los elementos de la cola
                                                                            11.Salir""", "Menu de opciones de una Cola", JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a insertar", "Insertando en la cola", JOptionPane.QUESTION_MESSAGE));
                        col.Insertar(elemento);
                        break;
                    case 2:
                        if (!col.Vacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento atendido es " + col.Quitar(),
                                    "Quitando Elementos de la cola", JOptionPane.QUESTION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está vacia",
                                    "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                        }
                        break;

                    case 3:
                        if (col.Vacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola NO está vacia",
                                    "Cola NO vacia", JOptionPane.QUESTION_MESSAGE);
                        }
                        break;

                    case 4:

                        if (!col.Vacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de cola es: " + col.InicioCola(),
                                    "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia",
                                    "Cola vacia", JOptionPane.QUESTION_MESSAGE);
                        }

                        break;

                    case 5:
                        if (!col.Vacia()) {
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
                        col.invertirCola();
                        JOptionPane.showMessageDialog(null, "La cola ha sido invertida", "Invertir la cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 8:
                        col.MostrarCola();
                        break;
                    case 9:
                        cola copia = col.copiar();
                        StringBuilder sb = new StringBuilder("La cola copiada es: \n");
                        while (!copia.Vacia()) {
                            int elem = copia.Quitar();
                            sb.append(elem).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString(), "Copiando la cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 10:
                        
                            col.eliminarCola();
                            JOptionPane.showMessageDialog(null, "La cola se ha eliminado correctamente.", "Eliminación de cola", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "FIN", JOptionPane.QUESTION_MESSAGE);
                        System.exit(10);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Intente nuevamente", JOptionPane.QUESTION_MESSAGE);

                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 11);
    }

