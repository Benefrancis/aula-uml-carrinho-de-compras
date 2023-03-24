package model;

import java.util.Arrays;

public class CarrinhoDeCompra {
    private Produto[] itens;

    public Produto[] getItens() {
        return itens;
    }

    public double calcularValorTotal() {
        int contador = 0;
        double valorTotal = 0;
        while (contador < itens.length) {
            valorTotal = valorTotal + itens[contador].getValor();
            contador = contador + 1;
        }
        return valorTotal;
    }

    public void addProduto(Produto produto) {
        int tamanho = itens != null ? itens.length : 0;
        if (tamanho == 0) itens = new Produto[tamanho + 1];
        itens = Arrays.copyOf(itens, tamanho + 1);
        itens[tamanho] = produto;
    }

}
