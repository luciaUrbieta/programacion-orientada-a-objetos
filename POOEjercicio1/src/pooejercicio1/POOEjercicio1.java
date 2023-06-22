/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package pooejercicio1;

import java.util.Scanner;
import pooejercicio1.entidad.Libro;

public class POOEjercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro libro1 = new Libro();
        
        cargarLibro(libro1);
        
        mostrarDatos(libro1);  
    }
    
    public static void cargarLibro(Libro libro){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN del libro");
        libro.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el titulo del libro");
        libro.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor del libro");
        libro.setAutor(leer.next());
        
        System.out.println("Ingrese la cantidad de páginas del libro");
        libro.setCantidadPaginas(leer.nextInt());
    }
    
    public static void mostrarDatos(Libro libro){
        
        System.out.println(libro.getISBN());
        
        System.out.println(libro.getTitulo());
        
        System.out.println(libro.getAutor());
        
        System.out.println(libro.getCantidadPaginas());
        
        System.out.println(libro);
    }
    
}
