package categories;

import connection.ConnectionFactory;
import model.bean.Category;

import javax.persistence.EntityManager;

public class CategoryTest {

    public static void main(String[] args) {
        Category c = new Category("Tecnologias", "Tecnologias para seu conforto");
        Category c1 = new Category("Bebidas", "Bebidas geladas");


        EntityManager em = new ConnectionFactory().createConnection();


        em.close();
//        emf.close();
    }
}
