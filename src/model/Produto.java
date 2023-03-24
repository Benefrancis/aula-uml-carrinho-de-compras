package model;

public class Produto {

    private String nome;

    private String descricao;

    private float valor;

    public float getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Produto setValor(float valor) {
        this.valor = valor;
        return this;
    }

    public void addAoCarrinho(CarrinhoDeCompra carrinho) {
        carrinho.addProduto(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
