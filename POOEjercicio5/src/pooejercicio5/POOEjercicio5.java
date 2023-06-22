/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooejercicio5;

import entidades.CuentaBancaria;
import java.util.Scanner;
import servicios.ServicioCuentaBancaria;

public class POOEjercicio5 {

    public static void main(String[] args) {
        
        ServicioCuentaBancaria scb = new ServicioCuentaBancaria();
        
        System.out.println("Bienvenida! Para comenzar debe crear una cuenta bancaria.");
        CuentaBancaria cb1 = scb.crearCuentaBancaria();
        
        boolean continuar = true;
        
        do{
        continuar=menu(cb1);   
        }while(continuar);
        
        System.out.println("Ha salido con exito.");
    }
    
    public static boolean menu(CuentaBancaria cb){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCuentaBancaria scb = new ServicioCuentaBancaria();
        
        int opcion;
        
        System.out.println("Seleccione una opcion del siguiente menú:"); 
        System.out.println("1. Ingresar dinero.");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Extracción rápida (menos del 20% del saldo).");
        System.out.println("4. Consultar saldo.");
        System.out.println("5. Consultar datos");
        System.out.println("6. Salir");

        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                scb.ingresarDinero(cb);
                break;
            case 2:
                scb.retirarDinero(cb);
                break;
            case 3:
                scb.extraccionRapida(cb);
                break;
            case 4:
                scb.consultarSaldo(cb);
                break;
            case 5:
                scb.consultarDatos(cb);
                break;
            case 6:
                return false;
        }
        return true;
    }   
}
