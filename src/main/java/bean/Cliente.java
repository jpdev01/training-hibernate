package bean;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;
@Entity
public class Cliente {

    // IDENTIFY É MYSQL
    // AUTO É DEFAULT
    // AUTO VIRA AUTO INCREMENTO P/ MYSQL
    // ORACLE SERIA SEQUENCE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne
    private RG rg;


    private Set<Livro> livros = new LinkedHashSet<Livro>();

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

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }
}
