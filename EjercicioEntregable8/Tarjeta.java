package EjercicioEntregable8;

public class Tarjeta extends Titular {
    private String eFinanciera;
    private String eBancaria;
    private String numero;
    private double saldo;

    public Tarjeta(String nombreTitular, String apellidoTitular, String dniTitular, 
            String telefonoTitular, String emailTitular, 
            String eFinanciera, String eBancaria, 
            String numero, double saldo) {
        super(nombreTitular, apellidoTitular, dniTitular, telefonoTitular, emailTitular);
        this.eFinanciera = eFinanciera;
        this.eBancaria = eBancaria;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getEntidadFinanciera() {
        return eFinanciera;
    }

    public void setEntidadFinanciera(String eFinanciera) {
        this.eFinanciera = eFinanciera;
    }

    public String getEntidadBancaria() {
        return eBancaria;
    }

    public void setEntidadBancaria(String eBancaria) {
        this.eBancaria = eBancaria;
    }

    public String getNumeroTarjeta() {
        return numero;
    }

    public void setNumeroTarjeta(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
