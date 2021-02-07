import bean.Cliente;

import java.util.Date;

public class RG {

    private Integer id;
    private String number;
    private Cliente cliente;
    private Date dataEspedicao;

    public RG(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataEspedicao() {
        return dataEspedicao;
    }

    public void setDataEspedicao(Date dataEspedicao) {
        this.dataEspedicao = dataEspedicao;
    }
}
