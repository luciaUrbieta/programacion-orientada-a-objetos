package servicios;

import com.sun.org.glassfish.gmbal.Impact;
import java.util.Scanner;
import entidades.Persona;

public class ServicioPersona {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre");
        String nombre = scanner.next();
        
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese su sexo");
        String sexo = scanner.next();
        sexo = sexo.toUpperCase();
        
        String f = "F";
        String m = "M";
        String o = "O";
        
        if(sexo.equals(f)==false && sexo.equals(m)==false && sexo.equals(o)==false){
            do{
                System.out.println("El sexo ingresado es invalido. Ingrese una respuesta válida");
                sexo = scanner.next();
                sexo = sexo.toUpperCase();
            }while(sexo.equals(f)==false && sexo.equals(m)==false && sexo.equals(o)==false);
        }
        
        System.out.println("Ingrese su peso");
        double peso = scanner.nextDouble();
        
        System.out.println("Ingrese su altura");
        double altura = scanner.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona persona){
       
        int IMC=0;
          
        double calculoIMC = persona.getPeso()/(persona.getAltura()*persona.getAltura());
        
        if (calculoIMC<20){
                IMC = -1;
        }
        else if(calculoIMC<= 25 || calculoIMC>= 20){
            IMC = 0;
        }
        else if(calculoIMC>25){
            IMC = 1;
        }
        
        return IMC;
    }
    
    public boolean esMayorDeEdad(Persona persona){
        
        boolean esMayor = false;
        
        if(persona.getEdad()>=18){
            esMayor = true;
        }
        
        return esMayor;
    }
    
    
    
}
