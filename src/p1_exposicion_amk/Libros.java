/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_exposicion_amk;

/**
 *
 * @author Usuario
 */
public class Libros {

    private String autor;
    private String titulo;
    boolean disponible;

    public Libros() {
        this.disponible = true;
    }

    public Libros(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado");
        } else {
            System.out.println("El libro no esta disponible");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro ha sido devuelto");
    }

    public String toString() {
        return "||Autor: " + autor + "||Titulo: " + titulo + "||Disponible: " + disponible + "||";
    }
}
