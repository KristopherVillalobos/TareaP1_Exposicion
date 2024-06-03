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

        Biblioteca biblioteca = new Biblioteca(100);

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

        
        Usuario Persona1 = new Usuario("Josue Garcia", "Dragones");
        Usuario Persona2 = new Usuario("David Villa", "El mayor robo de la Historia");
        Usuario Persona3 = new Usuario("Yandel Molina", "Traumas de la infancia, La ciencia atras de el deporte");
        Usuario Persona4 = new Usuario("Javier Freson", "Situaciones adversas");
        Usuario Persona5 = new Usuario("Silvia Meza", "Recetas de Cocina, Una Noche en Paris");
        Usuario Persona6 = new Usuario("Lizeth Reyes", "Libro de Comedia");
        Usuario Persona7 = new Usuario("Diego Mejia", "S.O.S, Matrix");
        Usuario Persona8 = new Usuario("Cristiano Donaldo", "Como funcionan realmente las cosas");
        Usuario Persona9 = new Usuario("Frionel Pessi", "Situaciones adversas");
        Usuario Persona10 = new Usuario("Obeth Andino", "Nosotras las Mujeres");

        do {
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("Hola Bienvenido a nuestra Biblioteca");
            System.out.println("Que Desea Hacer");
            System.out.println("1) Mostrar catalogo");
            System.out.println("2) Mostrar Usuarios");
            System.out.println("3) Rentar");
            System.out.println("4) Devolver");
            System.out.println("5) Salir");
            System.out.println("--------------------------------------");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    biblioteca.mostrarCatalogo();
                    break;
                case 2:
                    Persona1.Info();
                    Persona2.Info();
                    Persona3.Info();
                    Persona4.Info();
                    Persona5.Info();
                    Persona6.Info();
                    Persona7.Info();
                    Persona8.Info();
                    Persona9.Info();
                    Persona10.Info();
                case 3:
                    System.out.print("Introduce el titulo del libro a rentar: ");
                    System.out.println("*Asegurese de escribir correctamente el nombre de el libro *");
                    break;
                case 4:
                    System.out.print("Introduce el titulo del libro a devolver: ");
                    System.out.println("Asegurese de escribir correctamente el nombre de el libro");
                    break;
                case 5:
                    System.out.println("Gracias por su visita.");
                    break;
                default:
                    System.out.println("Ingrese una opcion");
            }
        } while (opcion != 5);
    } 
}
