import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central las palmeras", "Av.Principal Pio Jamaramillo");


        // Creo los pisos
        Piso piso1 = new Piso(1);
        Piso piso2 = new Piso(2);
        //Añadir pisos al parqueadero
        parqueadero.getPisos().add(piso1);
        parqueadero.getPisos().add(piso2);

        //Plazas de parqueadero para el piso 1
        PlazaParqueadero plaza1 = new PlazaParqueadero("P1");
        PlazaParqueadero plaza2 = new PlazaParqueadero("P2");
        piso1.getPlazas().add(plaza1);
        piso2.getPlazas().add(plaza2);
        //Plazas de parqueadero para el piso 2
        PlazaParqueadero plaza3 = new PlazaParqueadero("P3");
        PlazaParqueadero plaza4 = new PlazaParqueadero("P4");
        piso2.getPlazas().add(plaza3);
        piso2.getPlazas().add(plaza4);

        //Disponibilidad de plazas en el parqueadero
        System.out.println("HOLA, Bienvenido al Parqueadero Central las palmeras");
        System.out.println("Hay plazas disponibles?");
        System.out.println("Estado de las plazas: ");
        // Para ocupar plaza
        plaza1.ocuparPlaza();
        System.out.println("Plaza P1 esta en estado: " + plaza1.consultarEstado());
        // Para reservar otra plaza
        plaza2.reservarPlaza();
        System.out.println("Plaza P2 esta en estado: " + plaza2.consultarEstado());

        // persona
        Persona persona1 = new Persona("Josue", "1101234567", "Jimenez");
        System.out.println(persona1);
        persona1.setNombre("Josue");
        persona1.setApellido("Jimenez");
        System.out.println("Informacion actualizada:");
        System.out.println(persona1);
        String nombre = persona1.getNombre();
        String apellido = persona1.getApellido();
        System.out.println("Nombre del Cliente: " + nombre + ", Apellido: " + apellido);

        //Para crear cliente
        Cliente cliente = new Cliente(2, "Tarjeta de credito");
        cliente.registrarse();
        cliente.pagarTiempoUso();

        //Visitante
        Visitante visitante =  new Visitante(5, "Efectivo", 2.50);
        System.out.println("Visitante esta registrado?");
        visitante.registrarse();
        visitante.pagarTiempoUso();
        System.out.println("Tarifa del visitante:" + visitante.getTarifa() + "por hora");

        // para crear un cliente regular
        ClienteRegular clienteRegular = new ClienteRegular(4, "Efectivo", true);
        clienteRegular.pagarTiempoUso();

        // para crear una reserva
        Reserva reserva = new Reserva(new Date(),2,"Reserva para un automovil");
        System.out.println("-----El cliente regular------- ");
        reserva.confirmarReserva();
        clienteRegular.pagarTiempoUso();

        //personal de trabajo
        Supervisor supervisor = new Supervisor("Luis Flores", "1078911234");
        Cajero cajero = new Cajero("Maria Montero", "1082971264");
        Guardia guardia = new Guardia("Mario Fernandez", "1093362375");

        // Realizar tareas
        supervisor.realizarTarea();
        cajero.realizarTarea();
        guardia.realizarTarea();

        //Vehiculos
        Automovil automovil = new Automovil("ABC123", "Toyota", "Rojo");
        Bicicleta bicicleta = new Bicicleta("BIC002", "Bike", "Azul");
        Motocicleta motocicleta = new Motocicleta("LOTB345", "Yamaha", "Negra");

        //estacionar vahiculos
        automovil.estacionar();
        automovil.ponerSeguro();

        bicicleta.estacionar();
        bicicleta.asegurarCadena();

        motocicleta.estacionar();
        motocicleta.asegurarCasco();



        }
    }
