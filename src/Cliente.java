public class Cliente {
    private int tiempoUso;
    private String metodoPago;

    public Cliente(int tiempoUso, String metodoPago) {
        this.tiempoUso = tiempoUso;
        this.metodoPago = metodoPago;
    }
    public void registrarse(){
        System.out.println(" *****Registrado***** ");
    }
    public void pagarTiempoUso(){

        System.out.println(" El cliente ha realizado su Pago. ");
    }
    public int getTiempoUso() {

        return tiempoUso;
    }
    public String getMetodoPago(){

        return metodoPago;
    }
}
class ClienteRegular extends Cliente{
    private boolean suscripcionActiva;

    public ClienteRegular(int tiempoUso, String metodoPago, boolean suscripcionActiva) {
        super(tiempoUso, metodoPago);
        this.suscripcionActiva = suscripcionActiva;
    }
    public void realizarReserva(){

        System.out.println("Reserva realizada. ");
    }
    public boolean isSuscripcionActiva() {

        return suscripcionActiva;
    }
}
class Visitante extends Cliente {
    private double tarifa;

    // Constructor
    public Visitante(int tiempoUso, String metodoPago, double tarifa) {
        super(tiempoUso, metodoPago);
        this.tarifa = tarifa;
    }
    public double calcularCosto() {
        return getTiempoUso() * tarifa;
    }

    @Override
    public void pagarTiempoUso() {
        double costo = calcularCosto();
        System.out.println("Pago realizado por el visitante. Total a pagar: " + costo + " con el metodo: " + getMetodoPago());
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}

