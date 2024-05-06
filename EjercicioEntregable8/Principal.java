package EjercicioEntregable8;

public class Principal {
    public static void main(String[] args) {

        Posnet postnet = new Posnet();

        Titular persona = new Titular("Facundo", "Reiseng", "39789454", "09852447",
                "facu_carhue@hotmail.com");

        Tarjeta tarjeta= new Tarjeta(
                persona.getNombreTitular(),
                persona.getApellidoTitular(),
                persona.getDniTitular(),
                persona.getTelefonoTitular(),
                persona.getEmailTitular(),
                "Mastercard",
                "Banco Provincia",
                "1234-5678-9012-3456",
                15000);

        System.out.println(postnet.efectuarPago(tarjeta, 12, 5000));
    }
}