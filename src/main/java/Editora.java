import java.util.LinkedHashSet;
import java.util.Set;

public class Editora {

    private Integer id;
    private String name;
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

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }
}
