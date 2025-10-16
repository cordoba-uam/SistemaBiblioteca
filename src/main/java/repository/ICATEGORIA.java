package repository;
import java.util.List;
import Entitie.Categoria;

public interface ICATEGORIA {
    void guardar(Categoria categoria);
    List<Categoria> listar();
}
