package model.dao;

import connection.ConnectionFactory;
import model.bean.Category;

import javax.persistence.EntityManager;

public class CategoryDAO {

    public Category save(Category c){

        EntityManager em = ConnectionFactory.getConnection();

        try {

            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();

        } catch (Exception e) {

            System.out.println("Erro de transação! Será feito rollback da transação. \n" + e );
            em.getTransaction().rollback();
            // desfaz tudo

        } finally {

            em.close();

        }

        return c;
    }
}
