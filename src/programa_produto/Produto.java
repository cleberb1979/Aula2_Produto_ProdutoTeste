package programa_produto;

public class Produto {

    String nome;
    double preco;
    double desconto;

    //criar após a 1a execução
    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    //criar após a 2a execução
    double precoComDescontoDoGerente(double descontoDoGerente) {
        return preco * (1 - desconto - descontoDoGerente);
    }
}
