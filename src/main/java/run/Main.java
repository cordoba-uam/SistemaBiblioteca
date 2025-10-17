package run;

import java.util.List;
import java.util.Scanner;

import config.JPAUtil;
import jakarta.persistence.EntityManager;
import models.*;
import interfaces.dao.*;

public class Main {

    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Entity Manager
        EntityManager em = JPAUtil.getEntityManager();

        // DAOs
        LibroDao libroDAO = new LibroDao(em);
        AutorDao autorDAO = new AutorDao(em);
        CategoriaDao categoriaDAO = new CategoriaDao(em);

        // Objetos

        Autor autor1 = new Autor();
        Autor autor2 = new Autor();

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();

        Categoria categoria1 = new Categoria();
        Categoria categoria2 = new Categoria();

        // *DEFINICIÓN DE LOS OBJETOS*
        // Categorias

        // Categoria 1
        System.out.println("\nIngrese el nombre de la categoria 1:");
        categoria1.setNombre(sc.nextLine());

        // Categoria 2
        System.out.println("Ingrese el nombre de la categoria 2:");
        categoria2.setNombre(sc.nextLine());

        categoriaDAO.insertarCategoria(categoria1);
        categoriaDAO.insertarCategoria(categoria2);

        // Autores

        // Autor 1
        System.out.println("\nIngrese el nombre del autor 1:");
        autor1.setNombre(sc.nextLine());

        System.out.println("Ingrese la nacionalidad del autor 1:");
        autor1.setNacionalidad(sc.nextLine());

        System.out.println("Ingrese la fecha de nacimiento del autor 1:");
        autor1.setFechaNacimiento(sc.nextLine());

        // Autor 2
        System.out.println("\nIngrese el nombre del autor 2:");
        autor2.setNombre(sc.nextLine());

        System.out.println("Ingrese la nacionalidad del autor 2:");
        autor2.setNacionalidad(sc.nextLine());

        System.out.println("Ingrese la fecha de nacimiento del autor 2:");
        autor2.setFechaNacimiento(sc.nextLine());

        autorDAO.crearAutor(autor1);
        autorDAO.crearAutor(autor2);

        // Libros

        // Libro 1
        System.out.println("\nIngrese el título del libro 1:");
        libro1.setTitulo(sc.nextLine());
        System.out.println("Ingrese el año de publicación del libro 1:");

        while(true){

            try{
                libro1.setYearPublicacion(Integer.parseInt(sc.nextLine()));
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el año de publicación:");
            }
        }

        System.out.println("Seleccione el autor del libro 1 (ingrese el ID):");

        while (true){

            try{
                Long idAutor = sc.nextLong();
                sc.nextLine();
                Autor autorSeleccionado = em.find(Autor.class, idAutor);
                if(autorSeleccionado != null){
                    libro1.setAutor(autorSeleccionado);
                    break;
                }
                else{
                    System.out.println("Error: No existe un autor con ese ID. Intente nuevamente:");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el ID:");
            }
        }

        System.out.println("Seleccione la categoría del libro 1 (ingrese el ID):");

        while (true){

            try{
                Long idCategoria = sc.nextLong();
                sc.nextLine();
                Categoria categoriaElegida = em.find(Categoria.class, idCategoria);
                if(categoriaElegida != null){
                    libro1.getCategoria().add(categoriaElegida);
                    break;
                }
                else{
                    System.out.println("Error: No existe una categoria con ese ID. Intente nuevamente:");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el ID:");
            }
        }

        Libro nuevoLibro = libroDAO.insertarLibro(libro1);
        System.out.println("\nLibro 1 guardado: " + nuevoLibro.getTitulo());

        // Libro 2

        System.out.println("\nIngrese el título del libro 2:");
        libro2.setTitulo(sc.nextLine());
        System.out.println("Ingrese el año de publicación del libro 2:");

        while(true){

            try{
                libro2.setYearPublicacion(Integer.parseInt(sc.nextLine()));
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el año de publicación:");
            }
        }

        System.out.println("Seleccione el autor del libro 2 (ingrese el ID):");

        while (true){

            try{
                Long idAutor = sc.nextLong();
                sc.nextLine();
                Autor autorSeleccionado = em.find(Autor.class, idAutor);
                if(autorSeleccionado != null){
                    libro2.setAutor(autorSeleccionado);
                    break;
                }
                else{
                    System.out.println("Error: No existe un autor con ese ID. Intente nuevamente:");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el ID:");
            }
        }

        System.out.println("Seleccione la categoría del libro 2 (ingrese el ID):");

        while (true){

            try{
                Long idCategoria = sc.nextLong();
                sc.nextLine();
                Categoria categoriaElegida = em.find(Categoria.class, idCategoria);
                if(categoriaElegida != null){
                    libro2.getCategoria().add(categoriaElegida);
                    break;
                }
                else{
                    System.out.println("Error: No existe una categoria con ese ID. Intente nuevamente:");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el ID:");
            }
        }

        nuevoLibro = libroDAO.insertarLibro(libro2);
        System.out.println("\nLibro 2 guardado: " + nuevoLibro.getTitulo());

        // Libro 3

        System.out.println("\nIngrese el título del libro 3:");
        libro3.setTitulo(sc.nextLine());
        System.out.println("Ingrese el año de publicación del libro 3:");

        while(true){

            try{
                libro3.setYearPublicacion(Integer.parseInt(sc.nextLine()));
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el año de publicación:");
            }
        }

        System.out.println("Seleccione el autor del libro 3 (ingrese el ID):");

        while (true){

            try{
                Long idAutor = sc.nextLong();
                sc.nextLine();
                Autor autorSeleccionado = em.find(Autor.class, idAutor);
                if(autorSeleccionado != null){
                    libro3.setAutor(autorSeleccionado);
                    break;
                }
                else{
                    System.out.println("Error: No existe un autor con ese ID. Intente nuevamente:");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el ID:");
            }
        }

        System.out.println("Seleccione la categoría del libro 3 (ingrese el ID):");

        while (true){

            try{
                Long idCategoria = sc.nextLong();
                sc.nextLine();
                Categoria categoriaElegida = em.find(Categoria.class, idCategoria);
                if(categoriaElegida != null){
                    libro3.getCategoria().add(categoriaElegida);
                    break;
                }
                else{
                    System.out.println("Error: No existe una categoria con ese ID. Intente nuevamente:");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido para el ID:");
            }
        }

        nuevoLibro = libroDAO.insertarLibro(libro3);
        System.out.println("\nLibro 3 guardado: " + nuevoLibro.getTitulo());

        // Listar libros
        System.out.println("\nLista de libros en la base de datos:");
        List<Libro> lista = libroDAO.listarLibros();

        for(Libro libro : lista){

            System.out.println(libro.toString());
        }
        // Fin
        sc.close();
        em.close();
        JPAUtil.emf.close();
    }
}
