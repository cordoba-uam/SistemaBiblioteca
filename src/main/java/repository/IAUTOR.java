package repository;

import java.util.List;
import Entitie.Autor;

public interface IAUTOR {
    void guardar(Autor autor);
    List<Autor> listar();
}
