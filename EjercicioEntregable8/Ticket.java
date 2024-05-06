package EjercicioEntregable8;

public class Ticket {
    private String nombreCliente;
    private String apellidoCliente;
    private double montoTotalApagar;
    private double montoCuota;

    public Ticket(String nombreCliente, String apellidoCliente, double montoTotalApagar, double montoCuota) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.montoTotalApagar = montoTotalApagar;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        String stringTicket = "Nombre: " + nombreCliente + "\n"
                + "Apellido: " + apellidoCliente + "\n"
                + "Monto total a pagar: " + montoTotalApagar + "\n"
                + "Monto cuota: " + montoCuota ;
        return stringTicket;
    }

}
