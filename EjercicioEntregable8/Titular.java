package EjercicioEntregable8;

public class Titular {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;

    public Titular (String nombre, String apellido, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombreTitular() {
        return nombre;
    }

    public void setNombreTitular(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoTitular() {
        return apellido;
    }

    public void setApellidoTitular(String apellido) {
        this.apellido = apellido;
    }

    public String getDniTitular() {
        return dni;
    }

    public void setDniTitular(String dni) {
        this.dni = dni;
    }

    public String getTelefonoTitular() {
        return telefono;
    }

    public void setTelefonoTitular(String telefono) {
        this.telefono = telefono;
    }

    public String getEmailTitular() {
        return email;
    }

    public void setEmailTitular(String email) {
        this.email = email;
    }

}