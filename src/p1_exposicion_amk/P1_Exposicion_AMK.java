/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_exposicion_amk;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P1_Exposicion_AMK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lea = new Scanner(System.in);
        int opcion;
        
        Biblioteca biblioteca = new Biblioteca();
        
        
        biblioteca.agregarLibro(new Libros("Luis Fuente", "Atraves de los ojos"));
        biblioteca.agregarLibro(new Libros("Jose Luis", "Diario de una pasion"));
        biblioteca.agregarLibro(new Libros("Juan Carlos", "El porque de las cosas"));
        biblioteca.agregarLibro(new Libros("Jorge Calix", "Subconciente"));
        biblioteca.agregarLibro(new Libros("Josue Oved", "Traumas de la infancia"));
        biblioteca.agregarLibro(new Libros("Luis Mondragon", "¿Porque?"));
        biblioteca.agregarLibro(new Libros("Fernanda Molina", "El ojo Humano"));
        biblioteca.agregarLibro(new Libros("Claudia Munguia", "Nosotras las Mujeres"));
        biblioteca.agregarLibro(new Libros("Fernando Alonso", "La ciencia atras de el deporte"));
        biblioteca.agregarLibro(new Libros("Luis Conte", "Una Noche en Paris"));
        biblioteca.agregarLibro(new Libros("Gustavo Paredes", "La velada Eterna"));
        biblioteca.agregarLibro(new Libros("Leonel Sanchez", "Situaciones adversas"));
        biblioteca.agregarLibro(new Libros("Julieta Vanegas", "El Karma"));
        biblioteca.agregarLibro(new Libros("Valeria Rodriguez", "Nuestro Cuerpo"));
        biblioteca.agregarLibro(new Libros("Carla Lopez", "Libro de Comedia"));
        biblioteca.agregarLibro(new Libros("Luis Murillo", "recetas de cocina"));
        biblioteca.agregarLibro(new Libros("Florentino Peces", "El mayor robo de la Historia"));
        biblioteca.agregarLibro(new Libros("Mario Rivera", "Como funcionan realmente las cosas"));
        biblioteca.agregarLibro(new Libros("Juan Gomez", "Dragones"));
        biblioteca.agregarLibro(new Libros("Nicolas Dominguez", "S.O.S"));
        biblioteca.agregarLibro(new Libros("Maria Perez", "Matrix"));

        do {
            System.out.println("----------------------------------");
            System.out.println("Hola Bienvenido a nuestra Biblioteca");
            System.out.println("Que desea hacer?");
            System.out.println("1) Mostrar catalogo");
            System.out.println("2) Rentar");
            System.out.println("3) Devolver");
            System.out.println("4) Salir");
            System.out.println("----------------------------------");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    biblioteca.mostrarCatalogo();
                    break;
                case 2:
                    System.out.print("Introduce el título del libro a rentar: ");
                    String tituloRentar = lea.nextLine();
                    biblioteca.rentarLibro(tituloRentar);
                    break;
                case 3:
                    System.out.print("Introduce el título del libro a devolver: ");
                    String tituloDevolver = lea.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;
                case 4:
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Ingrese una opcion");
            }
        } while (opcion != 4);
    } 
}
