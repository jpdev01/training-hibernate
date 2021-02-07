package model.dao;

import connection.ConnectionFactory;
import model.bean.Product;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductDAO {

    public void save(Product p){

        EntityManager em = ConnectionFactory.getConnection();

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

    public Product findById(Integer id){
        EntityManager em = ConnectionFactory.getConnection();
        Product product = null;
        try {
            product =  em.find(Product.class, id);
        } catch (Exception e){
            System.err.println(e);
        } finally {
            em.close();
        }
        return product;
    }

    public List<Product> findAll(){
        EntityManager em = ConnectionFactory.getConnection();
        List<Product> products = null;

        try {

            products = em.createQuery("FROM Product p").getResultList();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return products;
    }
}
