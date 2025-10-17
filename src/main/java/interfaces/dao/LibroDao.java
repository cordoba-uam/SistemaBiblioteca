package interfaces.dao;

import interfaces.ILibro;
import models.Libro;
import jakarta.persistence.EntityManager;

import java.util.List;

public class LibroDao implements ILibro {

    private final EntityManager em;

    public LibroDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Libro insertarLibro(Libro libro) {

        em.getTransaction().begin();
        if(libro.getIdLibro() == null){

            em.persist(libro);
        }
        else{

            libro = em.merge(libro);
        }
        em.getTransaction().commit();
        return libro;
    }

    @Override
    public List<Libro> listarLibros() {

        return em.createQuery("FROM Libro", Libro.class).getResultList();
    }
}
