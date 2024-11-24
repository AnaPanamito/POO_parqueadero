import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private List<Piso>pisos;
    public Parqueadero(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new ArrayList<Piso>();
    }
    public void gestionarPisos(){
    }
    public boolean consultarDisponibilidad(){
        for(Piso piso : pisos){
            if(!piso.obtenerPlazasDisponibles().isEmpty()) return true;
        }
        return false;
    }
    public String getNombre() {

        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public List<Piso> getPisos() {

        return pisos;
    }

    }
