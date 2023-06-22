/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package pooejercicio2;

import pooejercicio2.entidades.Circunferencia;
import pooejercicio2.servicios.CircunferenciaServicio;

public class POOEjercicio2 {

    public static void main(String[] args) {
        
        CircunferenciaServicio sc = new CircunferenciaServicio();
        
        Circunferencia c1 = sc.crearCircunferencia();
        
        c1.area();
        
        c1.perimetro();

        System.out.println("Su circunferencia es de un radio de: " + c1.getRadio());
        System.out.println("El perimetro de su circunferencia es de: " + c1.getPerimetro());
        System.out.println("El area de su circunferencia es de: " + c1.getArea()); 
        
        System.out.println(c1);
    }
    
}
