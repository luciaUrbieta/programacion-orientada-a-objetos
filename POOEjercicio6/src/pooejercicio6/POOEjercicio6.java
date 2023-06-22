/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooejercicio6;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.ServicioCafetera;


public class POOEjercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        ServicioCafetera sc = new ServicioCafetera();
        
        Cafetera cafetera = sc.crearCafetera();

        boolean continuar;
        
         
        System.out.println("Bienvenida al programa Nexpresso!");
        
        do{
           continuar = menu(cafetera);
        }
        while(continuar);
        
        System.out.println("Hasta la procsimaaaa");
         
    }
    
    public static boolean menu(Cafetera cafetera){
        
        ServicioCafetera sc = new ServicioCafetera();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean continuar = true;
        String opcion;
       
        System.out.println("Su cafetera tiene una capacidad de " + cafetera.getCapacidadMaxima() + " lt");
        System.out.println("Actualmente cuenta con " + cafetera.getCantidadActual() + " lt");
        System.out.println("");
        System.out.println("Ingrese la opción deseada.");
        System.out.println("A. Quiero servir una taza.");
        System.out.println("B. Quiero agregar café");
        System.out.println("C. Quiero llenar la cafetera");
        System.out.println("D. Quiero vaciar la cafetera.");
        System.out.println("E. No quiero más café.");
        
        opcion = leer.next();
        
        switch(opcion.toUpperCase()){
            case "A":
                sc.servirTaza(cafetera);
                break;
            case "B":
                sc.agregarCafe(cafetera);
                break;
            case "C":
                sc.llenarCafetera(cafetera);
                break;
            case "D":
                sc.vaciarCafetera(cafetera);
                break;
            case "E":
                continuar = false;   
                break;
            default:
                System.out.println("La opcion ingresada no está disponible.");
                break;    
        }
        
        return continuar;
    }
    
}
