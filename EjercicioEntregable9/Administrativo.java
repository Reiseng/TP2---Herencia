package EjercicioEntregable9;

public class Administrativo extends Empleado {

    private int horasTrabajadas;
    private String categoria = "Administrativo";

    public Administrativo(String nombre, String apellido, String dni, String domicilio, int fechaIngreso) {
        super(nombre, apellido, dni, domicilio, fechaIngreso);
        horasTrabajadas = 0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCategoria() {
        return categoria;
    }

    public double calcularSueldo() {
        return getSueldoBase() + 10000 * horasTrabajadas;
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
