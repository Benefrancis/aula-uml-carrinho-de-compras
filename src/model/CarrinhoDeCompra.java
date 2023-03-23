package model;

public class CarrinhoDeCompra {

    private Produto[] itens;

    private double calcularValorTotal(){
        int contador = 0;
        double valorTotal = 0;
        while (contador < itens.length){
            valorTotal = valorTotal + itens[contador].getValor();
            contador = contador + 1;
        }
        return valorTotal;
    }

}
