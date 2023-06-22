import Entidades.Vehiculo;
import Servicios.VehiculoService;

public class Main {
    public static void main(String[] args) {
        VehiculoService vs = new VehiculoService();
        Vehiculo automovil =  vs.crearVehiculo();
        Vehiculo motocicleta =  vs.crearVehiculo();
        Vehiculo bicicleta =  vs.crearVehiculo();

        System.out.println(vs.moverse(automovil, 5));
        System.out.println(vs.moverse(motocicleta, 5));
        System.out.println(vs.moverse(bicicleta, 5));

        System.out.println(vs.moverse(automovil, 10));
        System.out.println(vs.moverse(motocicleta, 10));
        System.out.println(vs.moverse(bicicleta, 10));

        System.out.println(vs.moverse(automovil, 60));
        System.out.println(vs.moverse(motocicleta, 60));
        System.out.println(vs.moverse(bicicleta, 60));

        int movimientoAutomovil = vs.moverse(automovil, 300) + vs.frenar(automovil);
        int movimientoMotocicleta = vs.moverse(motocicleta, 300) + vs.frenar(motocicleta);
        int movimientoBicicleta =   vs.moverse(bicicleta, 300) + vs.frenar(bicicleta);

        int max = Math.max(movimientoAutomovil, Math.max(movimientoBicicleta, movimientoMotocicleta));

        System.out.println("Max: " + max);
    }
}
