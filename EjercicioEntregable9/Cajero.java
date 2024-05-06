package EjercicioEntregable9;

public class Cajero extends Empleado {

    private String categoria = "Cajero";

    public Cajero(String nombre, String apellido, String dni, String domicilio, int fechaIngreso) {
        super(nombre, apellido, dni, domicilio, fechaIngreso);
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
        System.out.println("Total a cobrar:" + getSueldoBase());
        System.out.println("**********************");
    }

}
