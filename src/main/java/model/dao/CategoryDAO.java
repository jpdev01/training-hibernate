package model.dao;

import connection.ConnectionFactory;
import model.bean.Category;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoryDAO {

    public Category save(Category c){
        EntityManager em = new ConnectionFactory().createConnection();
        try {

            em.getTransaction().begin();

            if (c.getId() == null){
                // nao tem ID: significa que é um objeto novo, insert.
                em.persist(c);
            }
            else {
                // se tiver id, significa que já foi persistido, update
                em.merge(c);
            }
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

    public Category findById(Integer id){
        EntityManager em = new ConnectionFactory().createConnection();
        Category category = null;

        try{

            category = em.find(Category.class, id);

        } catch (Exception e){
            System.out.println("Erro ao fazer busca pelo id\n" + e);
        } finally {
            em.close();
        }

        return category;
    }

    public List<Category> findAll(){
        EntityManager em = new ConnectionFactory().createConnection();
        // busca por query
        List<Category> categories = null;

        try {

            // JDBC: SELECT * FROM CATEGORY
            categories = em.createQuery("from Category").getResultList();

        } catch (Exception e) {

            System.err.println(e);

        } finally {

            em.close();
        }

        return categories;
    }

    public void remove(Integer id){
        EntityManager em = new ConnectionFactory().createConnection();
        try {

            Category c = findById(id);
            if (c != null) {
                em.getTransaction().begin();
                em.remove(c);
                em.getTransaction().commit();
            }

        } catch (Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
