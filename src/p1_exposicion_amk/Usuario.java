/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_exposicion_amk;

/**
 *
 * @author Usuario
 */
public class Usuario {
     private String usuario;
    private String librosPrestados;

    public Usuario(String usuario) {
        this.usuario = usuario;
        this.librosPrestados = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(String librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void info() {
        System.out.println("Nombre del Usuario: " + usuario);
        System.out.println("Libros Prestados: " + librosPrestados);
    }
}
