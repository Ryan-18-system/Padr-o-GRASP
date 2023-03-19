package br.edu.ifpb.locadora.classificacoes;

public class ClassificacaoOnline extends Classificacao {
    private static final int ONLINE = 3;
    @Override
    public int getCodigoDePreco() {
        return ONLINE;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double preco = 0.0;
        preco += 10.0;
        if(diasAlugados > 4) {
            preco += (diasAlugados - 4) * 1.5;
        }

        return preco;
    }
}
