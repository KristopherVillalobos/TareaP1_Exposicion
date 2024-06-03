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
    private List<Libros> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libros libro) {
        libros.add(libro);
    }

    public void rentarLibro(String titulo) {
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro no esta disponible");
    }

    public void devolverLibro(String titulo) {
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isDisponible()) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro no se encontro");
    }

    public void mostrarCatalogo() {
        if (libros.isEmpty()) {
            System.out.println("El catalogo de libros esta vacio");
        } else {
            System.out.println("Catalogo de libros disponibles: ");
            for (Libros libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
