/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

public class Rectangulo {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        
        System.out.println("Ingrese la base de su rectangulo");
        base = leer.nextInt();
        
        System.out.println("Ingrese la altura de su rectangulo");
        altura = leer.nextInt();
    }
    
    public int calcularSuperficie(){
        
        int superficie = base * altura; 
        
        return superficie;
    }
    
    public int calcularPerimetro(){
        
        int perimetro = (base + altura)*2;  
        
        return perimetro;
    }
           
    public void dibujoRectangulo(){
        
        for(int i=0; i<altura; i++){
            
            for(int j=0; j<base; j++){
                
                if(j==0 || i==0 || j==base-1 || i==altura-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }   
            System.out.println("");
        }
    }      
}
