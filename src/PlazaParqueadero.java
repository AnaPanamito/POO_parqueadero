public class PlazaParqueadero {
    public String consultarEstado;
    private String numeroIdentificador;
    private EstadoPlaza estado;

    public PlazaParqueadero(String numeroIdentificador){
        this.numeroIdentificador = numeroIdentificador;
        this.estado = EstadoPlaza.DISPONIBLE;
    }
    public void ocuparPlaza(){
        if (estado == EstadoPlaza.DISPONIBLE){
            estado = EstadoPlaza.OCUPADA;
        } else {
            throw new IllegalArgumentException("La plaza no esta disponible para ocupar");
        }
    }
    public void reservarPlaza(){
        if (estado == EstadoPlaza.DISPONIBLE){
            estado = EstadoPlaza.RESERVADA;
        } else {
            throw new IllegalArgumentException("La plaza no esta disponible para reservar");
        }
    }
    public void liberarPlaza(){
        if (estado == EstadoPlaza.OCUPADA || estado == EstadoPlaza.RESERVADA){
            estado = EstadoPlaza.DISPONIBLE;
        } else {
            throw new IllegalArgumentException("La plaza ya esta disponible");
        }
    }
    public EstadoPlaza consultarEstado() {
        return estado;
    }
    public String getNumeroIdentificador() {
        return numeroIdentificador;
    }

}
