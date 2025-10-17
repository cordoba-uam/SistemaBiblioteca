package interfaces.dao;

import interfaces.IAutor;
import models.Autor;
import jakarta.persistence.EntityManager;

public class AutorDao implements IAutor {

    private final EntityManager em;

    public AutorDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Autor crearAutor(Autor autor) {

        em.getTransaction().begin();
        if (autor.getId() == null){

            em.persist(autor);
        }
        else{

            autor = em.merge(autor);
        }

        em.getTransaction().commit();
        return autor;
    }
}
