import java.util.Date;

public class Reserva {
    private Date fechaHora;
    private int duracion;
    private String detalles;

    public Reserva(Date fechaHora, int duracion, String detalles) {
        this.fechaHora = fechaHora;
        this.duracion = duracion;
        this.detalles = detalles;
    }
    public void confirmarReserva() {
        System.out.println("RESERVA CONFIRMADA . ");
    }
    public void cancelarReserva() {

        System.out.println("RESERVA CANCELADA. ");
    }
    public Date getFechaHora() {
        return fechaHora;
    }
    public int getDuracion() {
        return duracion;
    }
    public String getDetalles() {
        return detalles;
    }
}
