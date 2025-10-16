package config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Libreria");

    public static EntityManager getEntityManager() {

        return emf.createEntityManager();
    }

    public void close() {
        emf.close();
    }
}
