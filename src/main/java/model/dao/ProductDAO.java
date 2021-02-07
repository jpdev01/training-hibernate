package model.dao;

import connection.ConnectionFactory;
import model.bean.Product;

import javax.persistence.EntityManager;

public class ProductDAO {
    private EntityManager em = ConnectionFactory.getConnection();

    public void save(Product p){

        try {
            em.getTransaction().begin(); // inicia a transação

            if (p.getId() == null){
                em.persist(p);
            } else {
                em.merge(p);
            }
            em.getTransaction().commit();

        } catch (Exception e){

            System.err.println(e);
            em.getTransaction().rollback();

        } finally {
            em.close();
        }

    }
}
