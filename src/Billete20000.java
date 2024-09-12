// src/Billete20000.java
public class Billete20000 implements Dispensador {
    private Dispensador siguiente;

    @Override
    public void establecerSiguiente(Dispensador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 20000) {
            int cantidadBilletes = cantidad / 20000;
            int resto = cantidad % 20000;
            System.out.println("Dispensando " + cantidadBilletes + " billetes de $20,000");
            if (resto != 0) {
                siguiente.procesar(resto);
            }
        } else {
            siguiente.procesar(cantidad);
        }
    }
}
