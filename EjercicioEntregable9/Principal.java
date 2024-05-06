package EjercicioEntregable9;

public class Principal {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Pedro", "Sanchez", "36588941", "pringles 1081", 1985);
        vendedor.setTotalVentas(100000);
        vendedor.imprimirRecibo();

        Administrativo administrativo = new Administrativo("Rodolfo", "Cordoba", "18562354", "Alsina 1500", 2024);
        administrativo.setHorasTrabajadas(10);
        administrativo.imprimirRecibo();

        Repartidor repartidor = new Repartidor("Marcelo", "Suarez", "35151345", "Colon 1054", 2019);
        repartidor.setRepartos(10);
        repartidor.imprimirRecibo();

        Cajero cajero = new Cajero("Fernando", "Muñoz", "23645321", "San Martin 422", 2005);
        cajero.imprimirRecibo();
    }
}