package Servicios;

import Entidades.Vehiculo;

import java.util.Scanner;

public class VehiculoService {


    public Vehiculo crearVehiculo() {
        Scanner scan = new Scanner(System.in)
                .useDelimiter("\n");

        Vehiculo v = new Vehiculo();

//        System.out.print("Marca: ");
//        v.setMarca(scan.next());
//
//        System.out.print("Modelo: ");
//        v.setModelo(scan.next());
//
//        System.out.print("Año: ");
//        v.setAnho(scan.nextInt());

        System.out.print("Tipo: ");
        v.setTipo(scan.next());

        return v;
    }

    public int moverse(Vehiculo v1, int segundos) {
        return getVelocidad(v1) * segundos;
    }

    public int frenar(Vehiculo v1) {
        return v1.getTipo().equals("bicicleta") ? 0 : 2;
    }

    public int getVelocidad(Vehiculo v1) {
        switch (v1.getTipo()){
            case "automovil": return 3;
            case "motocicleta": return 2;
            case "bicicleta": return 1;
            default: return 0;
        }
    }


}
