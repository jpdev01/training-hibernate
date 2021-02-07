package categories;

import bean.Categories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriesTest {

    public static void main(String[] args) {
        Categories c = new Categories("Tecnologias", "Tecnologias para seu conforto");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-hibernate");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
