/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_exposicion_amk;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
class Biblioteca {

    private Libros[] libros;
    private int cantidadLibros;

    public Biblioteca(int capacidadInicial) {
        this.libros = new Libros[capacidadInicial];
        this.cantidadLibros = 0;
    }

    public void agregarLibro(Libros libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
        }
    }

    public void rentarLibro(String titulo) {
        for (Libros libro : libros) {
            if (libro != null && libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) {
                libro.prestar();
                System.out.println("Libro rentado: " + libro.getTitulo());
                return;
            }
        }
        System.out.println("El libro no esta disponible");
    }

    public void devolverLibro(String titulo) {
        for (Libros libro : libros) {
            if (libro != null && libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    System.out.println("El libro " + titulo + " no ha sido rentado.");
                    return;
                } else {
                    libro.devolver();
                    System.out.println("El libro " + titulo + " ha sido devuelto correctamente");
                    return;
                }
            }
        }
        System.out.println("El libro " + titulo + " no se encuentra en la biblioteca");
    }

    public void mostrarCatalogo() {
        System.out.println("Catalogo de libros disponibles: ");
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libros[i]);
        }
    }
}
