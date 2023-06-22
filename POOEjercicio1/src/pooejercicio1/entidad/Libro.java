/*

 */
package pooejercicio1.entidad;

public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int cantidadPaginas;
    
    public Libro(){
        
    }

    public Libro(int ISBN, String titulo, String autor, int cantidadPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", cantidadPaginas=" + cantidadPaginas + '}';
    }

}
