// src/Billete10000.java
public class Billete10000 implements Dispensador {
    private Dispensador siguiente;

    @Override
    public void establecerSiguiente(Dispensador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 10000) {
            int cantidadBilletes = cantidad / 10000;
            int resto = cantidad % 10000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de $10,000");
            if (resto != 0) {
                siguiente.procesar(resto);
            }
        } else {
            siguiente.procesar(cantidad);
        }
    }
}

