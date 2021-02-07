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
}
