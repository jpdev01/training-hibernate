package categories;

import connection.ConnectionFactory;
import model.bean.Categories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriesTest {

    public static void main(String[] args) {
        Categories c = new Categories("Tecnologias", "Tecnologias para seu conforto");
        Categories c1 = new Categories("Bebidas", "Bebidas geladas");


        EntityManager em = new ConnectionFactory().createConnection();

        em.getTransaction().begin();
        em.persist(c);
        em.persist(c1);
        em.getTransaction().commit();

        em.close();
//        emf.close();
    }
}
