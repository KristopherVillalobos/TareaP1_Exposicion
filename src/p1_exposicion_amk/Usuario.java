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
    private String Nombre;
    private String librosprestados;
    
    public Usuario(String Nombre, String librosprestados) {
        this.Nombre = Nombre;
        this.librosprestados = librosprestados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLibrosprestados() {
        return librosprestados;
    }

    public void setLibrosprestados(String librosprestados) {
        this.librosprestados = librosprestados;
    }

    public void Info() {
        System.out.println("Nombre del Usuario: " + Nombre);
        System.out.println("Libros Prestados: " + librosprestados);
        System.out.println("");
    }
}
