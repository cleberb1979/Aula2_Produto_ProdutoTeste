package programa_produto;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.00;
        produto1.desconto = 0.30;

        Produto produto2 = new Produto();
        produto2.nome = "Celular";
        produto2.preco = 7000.00;
        produto2.desconto = 0.30;

        //double precoFinal1 = produto1.preco * (1-produto1.desconto);
        //System.out.printf("Valor do produto com Desconto: R$%.2f", precoFinal1);

        System.out.printf(produto1.nome + " Valor: R$%.2f\n", produto1.precoComDesconto());
        System.out.printf(produto2.nome + " Valor: R$%.2f\n", produto2.precoComDesconto());


        double precoFinal1 = produto1.precoComDesconto(0.10);
        double precoFinal2 = produto2.precoComDesconto() ;

        System.out.printf("Valor do Gerente: R$%.2f", precoFinal1);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("\nMédia do carrinho = R$%.2f", mediaCarrinho);






    }
}
