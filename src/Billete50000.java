// src/Billete50000.java
public class Billete50000 implements Dispensador {
    private Dispensador siguiente;

    @Override
    public void establecerSiguiente(Dispensador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 50000) {
            int cantidadBilletes = cantidad / 50000;
            int resto = cantidad % 50000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de $50,000");
            if (resto != 0) {
                siguiente.procesar(resto);
            }
        } else {
            siguiente.procesar(cantidad);
        }
    }
}
