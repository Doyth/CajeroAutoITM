// src/ManejadoraBase.java

public abstract class ManejadoraBase implements Dispensador {
    protected Dispensador siguiente;

    @Override
    public void establecerSiguiente(Dispensador siguiente) {
        this.siguiente = siguiente;
    }

    protected void pasarSiguiente(int cantidad) {
        if (siguiente != null) {
            siguiente.procesar(cantidad);
        }
    }
}
