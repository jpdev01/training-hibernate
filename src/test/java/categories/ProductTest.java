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
        updateTest();
        System.out.println(toString(findTest()));
    }

    public static void saveTest(){
        List<Product> produtos = new ArrayList<Product>();

        Category category = catgDao.findById(01);
        produtos.add(new Product("Produto 1", 120.00, "Produto de teste", 01, category));

        for (Product product : produtos){
            dao.save(product);
        }
    }

    public static void updateTest(){
        Category category = catgDao.findById(02);
        Product p = new Product (01, "Produto 1 alterado", 100.00, "Alteração", 01, category);
        dao.save(p);
    }

    public static Product findTest(){
        return dao.findById(01);
    }

    public static String toString(Product p){
        String txt = "";
        if (p != null){
            txt += "\nProduto\n";
            txt += "\nId: " + p.getId();
            txt += "\nNome: " + p.getName();
            txt += "\nDescrição: " + p.getDescription();
            txt += "\n Categoria: " + p.getCategory();
            txt += "\nValor: " + p.getValue();
        }
        return txt;
    }

}
