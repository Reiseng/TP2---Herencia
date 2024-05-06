package EjercicioEntregable9;

public class Repartidor extends Empleado {
    private int repartos;
    private String categoria = "Repartidor";

    public Repartidor(String nombre, String apellido, String dni, String domicilio, int fecha_ingreso_year) {
        super(nombre, apellido, dni, domicilio, fecha_ingreso_year);
        repartos = 0;
    }

    public double calcularSueldo() {
        return getSueldoBase() + (repartos * 500);
    }

    public int getRepartos() {
        return repartos;
    }

    public void setRepartos(int repartos) {
        this.repartos = repartos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void imprimirRecibo() {
        System.out.println("**********************");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio:" + getDomicilio());
        System.out.println("Fecha de Ingreso" + getFechaIngreso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Total a cobrar:" + calcularSueldo());
        System.out.println("**********************");
    }

}
