package EjercicioEntregable10;

public class CasaIndependiente extends InmuebleVivienda {
    private String conjunto;

    public CasaIndependiente(String idInmobiliario, Double areaM2, String direccion, int numeroHabitaciones, int numeroBaño) {
        super(idInmobiliario, areaM2, direccion, numeroHabitaciones, numeroBaño);
        conjunto = "Independiente";
    }

    void Imprimir() {
        super.Imprimir();
        System.out.println("Tipo de casa: " + conjunto);
    }
}
