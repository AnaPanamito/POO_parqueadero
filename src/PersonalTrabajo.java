public abstract class PersonalTrabajo {
    private String nombre;
    private String identificacion;

    public PersonalTrabajo(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public void realizarTarea() {
    }

    public String getNombre() {

        return nombre;
    }
    public String getIdentificacion() {

        return identificacion;
    }
}
class Supervisor extends PersonalTrabajo {
    public Supervisor(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    @Override
    public void realizarTarea() {
        System.out.println("El supervisor: ");
        System.out.println("Controla entrada y salida del personal trabajo. ");
    }
}
class Cajero extends PersonalTrabajo {
    public Cajero(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    @Override
    public void realizarTarea() {

        System.out.println("La cajera le cobra al cliente. ");
    }
}
class Guardia extends PersonalTrabajo {
    public Guardia(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    @Override
    public void realizarTarea() {
        System.out.println("El guardia se esta encargando de la seguridad del parqueadero. ");
    }
}
