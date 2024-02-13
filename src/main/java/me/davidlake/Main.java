package me.davidlake;

public class Main {
    public static void main(String[] args) {
        Libro pruebaLibro = new Libro(
                100,
                "David",
                "Las Crónicas de Narnia",
                "Acción"
        );

        Curriculum pruebaCurriculum = new Curriculum(
                "Mariana",
                "Ocampo",
                20,
                "Desarrolladora",
                new String[]{"Java", "Rust", "Go"}
        );

        Informe pruebaInforme = new Informe(
                50,
                25,
                "Dr. Chapatin",
                "Batman"
        );

        pruebaLibro.Imprimir();
        pruebaCurriculum.Imprimir();
        pruebaInforme.Imprimir();
    }}