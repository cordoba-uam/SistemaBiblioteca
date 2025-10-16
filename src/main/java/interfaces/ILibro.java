package interfaces;

import models.Libro;

import java.util.List;

public interface ILibro {

    Libro insertarLibro(Libro libro);
    List<Libro> listarLibros();
}
