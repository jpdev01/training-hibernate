package model.bean;

import javax.persistence.*;

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
    @ManyToOne
    private Category category;

    public Product(){

    }

    public Product(Integer id, String name, double value, String description, int qtde, Category category) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.description = description;
        this.qtde = qtde;
        this.category = category;
    }

    public Product(String name, double value, String description, int qtde, Category category) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.qtde = qtde;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
