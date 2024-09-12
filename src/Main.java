// src/Main.java
public class Main {
    public static void main(String[] args) {
        // Crear una instancia del cajero automático
        CajeroAutomatico cajero = new CajeroAutomatico();

        // Realizar pruebas con diferentes cantidades
        System.out.println("Dispenser $150,000:");
        cajero.dispensar(150000);

        System.out.println("\nDispenser $45,000:");
        cajero.dispensar(45000);

        System.out.println("\nDispenser $8,000:");
        cajero.dispensar(8000);

        System.out.println("\nDispenser $25,000:");
        cajero.dispensar(25000);
    }
}
