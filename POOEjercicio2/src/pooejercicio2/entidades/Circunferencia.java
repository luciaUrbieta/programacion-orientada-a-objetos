/*

 */
package pooejercicio2.entidades;

public class Circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public Circunferencia(){       
    }

    public double getRadio() {
        return radio;
    }
    
    public double getPerimetro(){
        return perimetro;
    }
    
    public double getArea(){
        return area;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void area(){
        
        area = Math.PI * Math.pow(radio, 2);
        
    } 
    
    public void perimetro(){
        
        perimetro = 2 * Math.PI * radio;  
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }  
}
