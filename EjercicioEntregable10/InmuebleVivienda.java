package EjercicioEntregable10;

public class InmuebleVivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBaño;

    public InmuebleVivienda(String idInmobiliario, Double areaM2, String direccion, int numeroHabitaciones, int numeroBaño) {
        super(idInmobiliario, areaM2, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaño = numeroBaño;
    }

    @Override
    void Imprimir() {
        super.Imprimir();
        System.out.println("Numero de Habitaciones: " + numeroHabitaciones);
        System.out.println("Numero de baños: " + numeroBaño);
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaño() {
        return numeroBaño;
    }

    public void setNumeroBaño(int numeroBaño) {
        this.numeroBaño = numeroBaño;
    }

}
