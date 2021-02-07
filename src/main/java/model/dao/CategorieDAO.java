package model.dao;

import connection.ConnectionFactory;
import model.bean.Categorie;

import javax.persistence.EntityManager;

public class CategorieDAO {

    public Categorie save(Categorie c){

        EntityManager em = ConnectionFactory.getConnection();

        try {

            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();

        } catch (Exception e) {

        } finally {

        }
    }
}
