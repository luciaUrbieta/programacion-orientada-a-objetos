/*

 */
package servicios;

import entidades.Operacion;
import java.util.Scanner;

public class OperacionServicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
    
         System.out.println("Ingrese el primer numero");
         int numero1 = leer.nextInt();
         
         System.out.println("Ingrese el segundo numero");
         int numero2 = leer.nextInt();
        
     return new Operacion(numero1, numero2);   
    }
    
    public static int sumar(Operacion o){
       
        int resultado = o.getNumero1() + o.getNumero2();

        return resultado;
    }
    
    public static int restar(Operacion o){
       
        int resultado = o.getNumero1() - o.getNumero2();

        return resultado;
    }
    
    public static int multiplicar(Operacion o){
        
        int resultado;
        
        if(o.getNumero1()==0 || o.getNumero2()==0){
            System.out.println("La multiplicación no puede hacerse porque uno de los numeros ingresados es 0");
            resultado = 0;
        }
        else{
            resultado = o.getNumero1() * o.getNumero2();
        }

        return resultado;
    }
    
    public static int dividir(Operacion o){
        
        int resultado;
        
        if(o.getNumero1()==0 || o.getNumero2()==0){
            System.out.println("La división no puede hacerse porque uno de los numeros ingresados es 0");
            resultado = 0;
        }
        else{
            resultado = o.getNumero1() / o.getNumero2();
        }

        return resultado;
    }
}
