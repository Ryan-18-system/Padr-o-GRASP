package br.edu.ifpb.locadora.classificacoes;

public class ClassificacaoInfantil extends Classificacao {
    private static final int INFANTIL = 2;
    @Override
    public int getCodigoDePreco() {
        return INFANTIL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double preco = 0.0;
        preco += 1.5;

        if(diasAlugados > 3) {
            preco += (diasAlugados - 3) * 1.5;
        }
        return preco;
    }
}
