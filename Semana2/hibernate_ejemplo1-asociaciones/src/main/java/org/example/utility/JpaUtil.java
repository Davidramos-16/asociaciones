package org.example.utility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    //Esta clase se creo para facilitar las operaciones de persistencia
    //EntityManager permite interactuar con la base de datos es decir se puede leer, escribir, actualizar, eliminar en la BD
    //EntityManagerFactory permite crear instancias de tipo EntityManager.
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();
    private static EntityManagerFactory buildEntityManagerFactory()
    {
        return Persistence.createEntityManagerFactory("ejemploJPA");
    }

    public static EntityManager getEntityManager()
    {
        return entityManagerFactory.createEntityManager();
    }
}
