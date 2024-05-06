package EjercicioEntregable10;

public class CasaCerrada extends InmuebleVivienda {
    private String conjunto;
    private int valorAdministracion;
    private Boolean areasComunes;

    public CasaCerrada(String idInmobiliario, Double area_m2, String direccion, int numeroHabitaciones, int numeroBaño, int valorAdministracion, Boolean areasComunes) {
        super(idInmobiliario, area_m2, direccion, numeroHabitaciones, numeroBaño);
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
        conjunto = "Privado";
    }

    void Imprimir() {
        super.Imprimir();
        System.out.println("Tipo de casa: " + conjunto);
        System.out.println("Valor Administracion:" + valorAdministracion);
        System.out.println("Areas Comunes:" + areasComunes);
    }
}
