package interfaces.dao;

import interfaces.ICategoria;
import models.Categoria;
import jakarta.persistence.EntityManager;

public class CategoriaDao implements ICategoria{

    private final EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Categoria insertarCategoria(Categoria categoria) {

        em.getTransaction().begin();

        if(categoria.getIdCategoria() == null){

            em.persist(categoria);
        }
        else{

            categoria = em.merge(categoria);
        }
        em.getTransaction().commit();
        return categoria;
    }
}
