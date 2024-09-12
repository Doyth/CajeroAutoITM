// src/Error.java
public class Error implements Dispensador {
    @Override
    public void procesar(int cantidad) {
        System.out.println("Error: La cantidad debe ser un múltiplo de $5,000.");
    }

    @Override
    public void establecerSiguiente(Dispensador siguiente) {
        // No hace nada, ya que es el final de la cadena
    }
}
