package EjercicioEntregable9;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
    private int fechaIngreso;
    private double sueldoBase = 650000;

    public Empleado(String nombre, String apellido, String dni, String domicilio, int fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public abstract void imprimirRecibo();

}
