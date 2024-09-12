// src/CajeroAutomatico.java
public class CajeroAutomatico {
    private final Dispensador cadena;

    public CajeroAutomatico() {
        Dispensador billete100000 = new Billete100000();
        Dispensador billete50000 = new Billete50000();
        Dispensador billete20000 = new Billete20000();
        Dispensador billete10000 = new Billete10000();
        Dispensador error = new Error();

        billete100000.establecerSiguiente(billete50000);
        billete50000.establecerSiguiente(billete20000);
        billete20000.establecerSiguiente(billete10000);
        billete10000.establecerSiguiente(error);

        this.cadena = billete100000;
    }

    public CajeroAutomatico(Dispensador cadena) {
        this.cadena = cadena;
    }

    public void dispensar(int cantidad) {
        if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad debe ser un múltiplo de $5,000.");
            return;
        }
        cadena.procesar(cantidad);
    }

    public Dispensador getCadena() {
        return cadena;
    }
}
