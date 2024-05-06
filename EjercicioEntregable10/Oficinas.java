package EjercicioEntregable10;

public class Oficinas extends Inmueble {
    private int valorM2;
    private String localizacion;

    public Oficinas(String idInmobiliario, Double areaM2, String direccion, int valorM2, String localizacion) {
        super(idInmobiliario, areaM2, direccion);
        this.valorM2 = 2400000;
        this.localizacion = localizacion;
    }

    void Imprimir() {
        super.Imprimir();
        System.out.println("ValorM2: " + valorM2);
        System.out.println("Localizacion:" + localizacion);
        System.out.println("Valor Inmueble:" + calcularValorInmueble());
    }

    double calcularValorInmueble() {
        return valorM2 * getAreaM2();
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

}
