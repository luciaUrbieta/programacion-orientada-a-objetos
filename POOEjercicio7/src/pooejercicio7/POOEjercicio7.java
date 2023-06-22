/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package pooejercicio7;

import entidades.Persona;
import servicios.ServicioPersona;

public class POOEjercicio7 {

    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
       
        System.out.println("Bienvenidx.");
        System.out.println("");
        Persona milu = sp.crearPersona();
        calcularIMC(milu);
        esMayor(milu);
        System.out.println("");
        System.out.println("Bienvenidx.");
        System.out.println("");
        Persona fede = sp.crearPersona();
        System.out.println("");
        System.out.println("Bienvenidx.");
        System.out.println("");
        Persona lu = sp.crearPersona();
        
        calcularIMC(milu);
        calcularIMC(fede);
        calcularIMC(lu);
        
        esMayor(fede);
        esMayor(lu);
        
        
    }
    
    public static void calcularIMC(Persona persona){
        
        ServicioPersona sp = new ServicioPersona();
        
        if(sp.calcularIMC(persona)==-1){
            System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
        }
        else if(sp.calcularIMC(persona)==0){
            System.out.println(persona.getNombre() + " está en su peso ideal");
        }
        else if(sp.calcularIMC(persona)==1){
            System.out.println(persona.getNombre() + " está por encima de su peso ideal");
        }
    }
    
    public static void esMayor(Persona persona){
        
        ServicioPersona sp = new ServicioPersona();
        
        if(sp.esMayorDeEdad(persona)==true){
            System.out.println(persona.getNombre() + " es mayor de edad");
        }
        else{
             System.out.println(persona.getNombre() + " no es mayor de edad");
        }
    }
    
}
