package categories;

import model.bean.Category;
import model.bean.Product;
import model.dao.CategoryDAO;
import model.dao.ProductDAO;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    private static ProductDAO dao = new ProductDAO();
    private static CategoryDAO catgDao = new CategoryDAO();

    public static void main(String[] args) {
        saveTest();
    }

    public static void saveTest(){
        List<Product> produtos = new ArrayList<Product>();

        Category category = catgDao.findById(01);
        produtos.add(new Product("Produto 1", 120.00, "Produto de teste", 01, category));

        for (Product product : produtos){
            dao.save(product);
        }
    }

}
