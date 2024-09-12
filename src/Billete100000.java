// src/Billete100000.java
public class Billete100000 implements Dispensador {
    private Dispensador siguiente;

    @Override
    public void establecerSiguiente(Dispensador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 100000) {
            int cantidadBilletes = cantidad / 100000;
            int resto = cantidad % 100000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de $100,000");
            if (resto != 0) {
                siguiente.procesar(resto);
            }
        } else {
            siguiente.procesar(cantidad);
        }
    }
}
