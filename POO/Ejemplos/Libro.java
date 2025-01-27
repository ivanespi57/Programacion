public class Libro {
    String isbn;
    String titulo;
    String autor;
    int numPaginas;

    public Libro() {}

    public Libro(String isbn, String autor){
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libro(String isbn, String autor, String titulo, int numPaginas){
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }
}
