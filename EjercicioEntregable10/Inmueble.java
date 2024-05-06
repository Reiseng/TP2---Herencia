package EjercicioEntregable10;

public class Inmueble {
    private String idInmobiliario;
    private Double areaM2;
    private String direccion;

    public Inmueble(String idInmobiliario, Double areaM2, String direccion) {
        this.idInmobiliario = idInmobiliario;
        this.areaM2 = areaM2;
        this.direccion = direccion;
    }

    void Imprimir() {
        System.out.println("ID: " + idInmobiliario);
        System.out.println("Area(M^2): " + areaM2);
        System.out.println("Direccion: " + direccion);
    }

    public String getIdInmobiliario() {
        return idInmobiliario;
    }

    public void setIdInmobiliario(String idInmobiliario) {
        this.idInmobiliario = idInmobiliario;
    }

    public Double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
