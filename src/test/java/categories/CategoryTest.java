package categories;

import connection.ConnectionFactory;
import model.bean.Category;
import model.dao.CategoryDAO;

import javax.persistence.EntityManager;

public class CategoryTest {

    public static void main(String[] args) {
        Category c = new Category("Tecnologias", "Tecnologias para seu conforto");
        Category c1 = new Category("Bebidas", "Bebidas geladas");

        CategoryDAO ctgDAO = new CategoryDAO();
        ctgDAO.save(c);
        ctgDAO.save(c1);
    }
}
