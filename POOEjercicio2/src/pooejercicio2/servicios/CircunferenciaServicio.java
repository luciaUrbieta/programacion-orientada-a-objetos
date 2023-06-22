package pooejercicio2.servicios;

import java.util.Scanner;
import pooejercicio2.entidades.Circunferencia;


public class CircunferenciaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia que desea crear");
        double radio = leer.nextDouble();  
        
        return new Circunferencia(radio);
    }
}
