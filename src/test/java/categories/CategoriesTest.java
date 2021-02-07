package categories;

import connection.ConnectionFactory;
import model.bean.Categorie;

import javax.persistence.EntityManager;

public class CategoriesTest {

    public static void main(String[] args) {
        Categorie c = new Categorie("Tecnologias", "Tecnologias para seu conforto");
        Categorie c1 = new Categorie("Bebidas", "Bebidas geladas");


        EntityManager em = new ConnectionFactory().createConnection();


        em.close();
//        emf.close();
    }
}
