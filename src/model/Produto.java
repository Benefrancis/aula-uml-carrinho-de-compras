package model;

public class Produto {

    private String nome;

    private String descricao;

    private float valor;

    public float getValor() {
        return valor;
    }

    public void addAoCarrinho(CarrinhoDeCompra carrinho) {
        carrinho.addProduto(this);
    }

}
