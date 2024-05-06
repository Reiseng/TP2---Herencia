package EjercicioEntregable10;

public class LocalComercial extends Inmueble {
    private int valorM2;
    private String centroComercial = "";

    public LocalComercial(String idInmobiliario, Double areaM2, String direccion, String centroComercial) {
        super(idInmobiliario, areaM2, direccion);
        this.valorM2 = 3000000;
        this.centroComercial = centroComercial;
    }

    void Imprimir() {
        super.Imprimir();
        System.out.println("Valor M2: " + valorM2);
        System.out.println("Centro Comercial:" + centroComercial);
        System.out.println("Valor Inmueble:" + calcularValorInmueble());
    }

    double calcularValorInmueble() {
        return valorM2 * getAreaM2();
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

}
