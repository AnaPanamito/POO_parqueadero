import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Piso {
    private int numeroPiso;
    private List<PlazaParqueadero> plazas;
    private PlazaParqueadero plaza;


    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.plazas = new ArrayList<>();
    }
    public void listarPlazas() {
        for (PlazaParqueadero Plaza : plazas) {
            System.out.println("Plaza: " + plaza.getNumeroIdentificador() + " Estado: " + plaza.consultarEstado);
        }
    }
    public List<PlazaParqueadero>obtenerPlazasDisponibles() {
        List<PlazaParqueadero> plazasDisponibles = new ArrayList<>();
        String EstadoPlaza = plaza.consultarEstado;
        for (PlazaParqueadero Plaza : plazas)
            if (Objects.equals(plaza.toString(), EstadoPlaza)) plazasDisponibles.add(Plaza);
        return plazasDisponibles;
    }
    public void consultarEstadoPlaza() {
        listarPlazas();
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }
    public List<PlazaParqueadero> getPlazas() {

        return plazas;
    }
}
