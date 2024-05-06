package EjercicioEntregable8;

public class Posnet {
    Ticket efectuarPago(Tarjeta tarjeta, int cuotas, double monto) {
        double montoConRecargo = monto + (calcularRecargo(cuotas) * monto);
        double saldoDisponible = tarjeta.getSaldo();
        if (saldoDisponible >= montoConRecargo) {
            Ticket ticket = new Ticket(tarjeta.getNombreTitular(), tarjeta.getApellidoTitular(), montoConRecargo, montoConRecargo / cuotas);
            return ticket;
        } else {
            return null;
        }
    }

    double calcularRecargo(int cuotas) {
        double recargo = 0;
        if (cuotas > 1) {
            recargo = 0.03 * (cuotas - 1);
        }
        return recargo;
    }
}
