package servicios;

import entidades.Cafetera;
import java.util.Scanner;
        
public class ServicioCafetera {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){

        int capacidadMaxima = (int)(Math.random()*100);
        int cantidadActual = (int)(Math.random()*10);
        
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera cafetera){
       
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());    
    }
    
    public void servirTaza(Cafetera cafetera){
        
        System.out.println("Ingrese cuantos ml llenan su taza de café");
        int capacidadTaza = leer.nextInt();
        
        int tazaLlena = cafetera.getCantidadActual() - capacidadTaza;
        
        if(tazaLlena<0){
            tazaLlena = cafetera.getCantidadActual();
            System.out.println("La taza no se llenó por completo; solo pudieron llenarse " + tazaLlena + " lt :(");
            cafetera.setCantidadActual(0);
        }
        else{
            tazaLlena = capacidadTaza;
            System.out.println("La taza pudo llenarse. Disfrute su café :)");
            cafetera.setCantidadActual(tazaLlena);
        }     
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera){
        
        System.out.println("Ingrese la cantidad de café que desea cargar");
        int cafe = leer.nextInt();
        
        if((cafetera.getCantidadActual() + cafe)>cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }
        else{
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        }
    }
  
}
