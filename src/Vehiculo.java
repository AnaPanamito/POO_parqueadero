public class Vehiculo {
    private String matricula;
    private String modelo;
    private String color;

    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }
    public void estacionar(){
        System.out.println("Estandar del vehiculo");
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
}
class Automovil extends Vehiculo {
    public Automovil(String matricula, String modelo, String color) {
        super(matricula, modelo, color);
    }
    public void ponerSeguro(){
        System.out.println("Seguro activado para el automovil");
    }
}
class Bicicleta extends Vehiculo {
    public Bicicleta(String matricula, String modelo, String color) {
        super(matricula, modelo, color);
    }

    public void asegurarCadena() {
        System.out.println("Cadena asegurada para la bicicleta.");
    }
}
class Motocicleta extends Vehiculo {
    public Motocicleta(String matricula, String modelo, String color) {
        super(matricula, modelo, color);
    }

    public void asegurarCasco() {
        System.out.println("Casco asegurado en la motocicleta.");
    }
}


