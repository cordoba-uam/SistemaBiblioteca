package repository;
import java.util.List;
import Entitie.Libro;

public interface ILIBRO {
    void guardar(Libro libro);
    List<Libro> listar();
}
