package model;

public class CarrinhoDeCompra {

    private Produto[] itens;

    private double calcularValorTotal() {
        int contador = 0;
        double valorTotal = 0;
        while (contador < itens.length) {
            valorTotal = valorTotal + itens[contador].getValor();
            contador = contador + 1;
        }
        return valorTotal;
    }

    private Produto[] getItens() {
        return itens;
    }

    protected void addProduto(Produto produto) {
        int tamanho = itens.length;
        itens = new Produto[itens.length];
        itens[tamanho] = produto;
    }

}
