package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuentaBancaria {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuentaBancaria(){
        
        System.out.println("Ingrese su numero de cuenta bancaria");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        
        System.out.println("Ingrese su saldo actual");
        int saldoActual = leer.nextInt();
        
        return new CuentaBancaria(numeroCuenta, dni, saldoActual);        
    }
    
    public void ingresarDinero(CuentaBancaria cb){
        
        System.out.println("Ingrese la cantidad de dinero que desea cargar");
        int ingreso = leer.nextInt();
        
        cb.setSaldoActual(cb.getSaldoActual() + ingreso); 
    }
    
    public void retirarDinero(CuentaBancaria cb){
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        int extraccion = leer.nextInt();

        if(extraccion<cb.getSaldoActual()){
            cb.setSaldoActual(cb.getSaldoActual() - extraccion); 
        }
        else{
            cb.setSaldoActual(0);
        }
    }
    
    public void extraccionRapida(CuentaBancaria cb){
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        int extraccion = leer.nextInt();

        if(extraccion<=(cb.getSaldoActual())/100*20){
            cb.setSaldoActual(cb.getSaldoActual() - extraccion); 
        }
        else{
             System.out.println("La extracción no puede realizarse debido a que la cantidad de dinero que desea retirar supera el 20% de su saldo actual");
        }
    }  
    
    public void consultarSaldo(CuentaBancaria cb){
        
        System.out.println("Su saldo actual es: $" + cb.getSaldoActual());   
    }
    
    public void consultarDatos(CuentaBancaria cb){
        
        System.out.println("Su numero de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("Su DNI es: " + cb.getDni());
        System.out.println("Su saldo actual es: $" + cb.getSaldoActual());   
    }
    
}
