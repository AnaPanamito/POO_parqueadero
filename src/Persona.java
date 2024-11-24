public class Persona {
    protected String nombre;
    protected String identificacion;
    protected String apellido;

    //Constructor
    public Persona(String nombre, String identificacion, String apellido) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.apellido = apellido;
    }
    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "Nombre del cliente: " + nombre + ", Identificacion: " + identificacion + ", Apellido: " + apellido;
    }
}
