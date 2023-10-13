package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Cliente;
import org.example.entity.Factura;
import org.example.utility.JpaUtil;

public class HibernateAsociacionesManyToOne {

    public static  void main(String [] arg)
    {
        EntityManager  em = JpaUtil.getEntityManager();



        try {

            em.getTransaction().begin();
            Cliente cliente = new Cliente("Ramos","Juan");
            cliente.setFormaPago("efectivo");
            em.persist(cliente);

            Factura factura = new Factura("Factura de ventas de materiales de construccion",300L);
            factura.setCliente(cliente);
            em.persist(factura);

            em.getTransaction().commit();
        }
        catch (Exception e)
        {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        finally {
            em.close();
        }

    }
}
