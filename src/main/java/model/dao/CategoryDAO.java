package model.dao;

import connection.ConnectionFactory;
import model.bean.Category;

import javax.persistence.EntityManager;

public class CategoryDAO {

    public Category save(Category c){

        EntityManager em = ConnectionFactory.getConnection();

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
        EntityManager em = ConnectionFactory.getConnection();

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
}
