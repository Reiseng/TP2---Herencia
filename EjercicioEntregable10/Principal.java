package EjercicioEntregable10;

public class Principal {
    public static void main(String[] args) {
        Apartamento depto = new Apartamento("12345", 200.0, "Pringles 652", 3, 4, 2000.0);

        depto.Imprimir();

        LocalComercial local = new LocalComercial("67890", 300.0, "Alsina 1250", "Shopping");
        System.out.println("********************");
        local.Imprimir();
    }
}