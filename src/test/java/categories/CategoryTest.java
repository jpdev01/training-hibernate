package categories;

import connection.ConnectionFactory;
import model.bean.Category;
import model.dao.CategoryDAO;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class CategoryTest {

    public static void main(String[] args) {
        saveTest();
    }

    public static void saveTest(){
        List<Category> categories = new ArrayList<>();
        Category c = new Category("Tecnologias", "Tecnologias para seu conforto");
        Category c1 = new Category("Bebidas", "Bebidas geladas");
        categories.add(c);
        categories.add(c1);

        CategoryDAO ctgDAO = new CategoryDAO();

        for (Category cat : categories ){
            ctgDAO.save(cat);
        }
    }
}
