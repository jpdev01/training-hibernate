package model.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double value;
    private String description;
    private int qtde;

    // muitos produtos para uma categoria
    @ManyToMany
    private List<Category> categories;

    public Product(){

    }

    public Product(Integer id, String name, double value, String description, int qtde, List<Category> categories) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.description = description;
        this.qtde = qtde;
        this.categories = categories;
    }

    public Product(String name, double value, String description, int qtde, List<Category> categories) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.qtde = qtde;
        this.categories = categories;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category)
    {
        if (this.categories == null)
        {
            this.setCategories(new ArrayList<>());
        }
        this.categories.add(category);
    }
}
