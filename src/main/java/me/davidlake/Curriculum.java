package me.davidlake;

import java.util.Arrays;

public class Curriculum implements Imprimible {
    String nombre;
    String apellido;
    int edad;
    String profesion;
    private final String[] habilidades;

    public Curriculum(String nombre, String apellido, int edad, String profesion, String[] habilidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.habilidades = habilidades;
    }

    @Override
    public void Imprimir() {
        System.out.println( "Curriculum{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", profesion='" + profesion + '\'' +
                ", habilidades=" + Arrays.toString(habilidades) +
                '}');
    }
}

