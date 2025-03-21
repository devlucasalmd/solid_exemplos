package lsp_principio.violacao;

import java.util.List;

public class Pedido {

    private Integer id;

    private String descricao;
    
    private List<Item> itens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> items) {
        this.itens = items;
    }
}
