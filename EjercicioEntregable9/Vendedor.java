package EjercicioEntregable9;

public class Vendedor extends Empleado {

    private int totalVentas;
    private String categoria = "Vendedor";

    public Vendedor(String nombre, String apellido, String dni, String domicilio, int fecha_ingreso_year) {
        super(nombre, apellido, dni, domicilio, fecha_ingreso_year);
        totalVentas = 0;
    }

    public double calcularComisionesVentas() {
        return totalVentas * 0.005;
    }

    public double calcularSueldo() {
        return getSueldoBase() + calcularComisionesVentas();
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void imprimirRecibo() {
        System.out.println("**********************");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio:" + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Comisiones por ventas: " + calcularComisionesVentas());
        System.out.println("Total a cobrar:" + calcularSueldo());
        System.out.println("**********************");
    }

    public String getCategoria() {
        return categoria;
    }

}
