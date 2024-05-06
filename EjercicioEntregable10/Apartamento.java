package EjercicioEntregable10;

public class Apartamento extends InmuebleVivienda {
    private double valorAdministracion;
    private String tipoApartamento;
    private double valorM2;

    public Apartamento(String idInmobiliario, Double areaM2, String direccion, int numeroHabitaciones, int numeroBaño, double valorAdministracion) {
        super(idInmobiliario, areaM2, direccion, numeroHabitaciones, numeroBaño);
        this.valorAdministracion = valorAdministracion;
        this.tipoApartamento = saberTipoApartamento();
        this.valorM2 = calcularM2();
    }

    double calcularValorInmueble() {
        return valorM2 * getAreaM2();
    }

    String saberTipoApartamento() {
        if (getNumeroHabitaciones() == 0) {
            return "Monoambiente";
        }
        return "Departamento Familiar";
    }

    double calcularM2() {
        if (tipoApartamento == "Monoambiente") {
            return 1000000;
        } else {
            return 1800000;
        }
    }

    void Imprimir() {
        super.Imprimir();
        System.out.println("Valor de administracion: " + valorAdministracion);
        System.out.println("Tipo de apartamento: " + tipoApartamento);
        System.out.println("Valor M2: " + valorM2);
        System.out.println("Valor Inmueble: " + calcularValorInmueble());
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public double getValorM2() {
        return valorM2;
    }

    public void setValorM2(double valorM2) {
        this.valorM2 = valorM2;
    }

}