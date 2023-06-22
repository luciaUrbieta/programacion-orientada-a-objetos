package Entidades;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anho;
    private String tipo;

    public Vehiculo(String marca, String modelo, int anho, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.tipo = tipo;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnho() {
        return anho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
