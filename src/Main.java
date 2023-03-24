import model.CarrinhoDeCompra;
import model.Produto;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompra nikeStore = new CarrinhoDeCompra();

        Produto tenis = new Produto();
        tenis.setNome("Nike Air Jordan XII")
                .setDescricao("Tênis de couro do famoso astro do basketball")
                .setValor(1499.99F);


        Produto meia = new Produto();
        meia.setNome("Meia de algodão")
                .setDescricao("Meia de algodão com desenho do Perna Longa")
                .setValor(199.99F);


        Produto bermuda = new Produto();
        bermuda.setNome("Bermuda Nike Street Wear")
                .setDescricao("Linda bermuda laranja com bolinhas amarelas")
                .setValor(1299.99F);

        nikeStore.addProduto(tenis);
        nikeStore.addProduto(meia);
        nikeStore.addProduto(bermuda);

        for (int i = 0; i < nikeStore.getItens().length; i++) System.out.println(nikeStore.getItens()[i]);

        System.out.println("*".repeat(50) + " TOTAL " + "*".repeat(50));

        System.out.printf("R$ %,.2f%n", nikeStore.calcularValorTotal());

    }
}