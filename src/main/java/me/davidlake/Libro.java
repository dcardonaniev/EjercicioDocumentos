package me.davidlake;

public class Libro implements Imprimible{
    int cantidadPaginas;
    String nombreAutor;
    String titulo;
    String genero;

    public Libro(
            int cantidadPaginas,
            String nombreAutor,
            String titulo,
            String genero
    ) {
        this.cantidadPaginas = cantidadPaginas;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public void Imprimir () {
        System.out.println("Libro{" +
                "cantidadPaginas=" + cantidadPaginas +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}');
    }
}
