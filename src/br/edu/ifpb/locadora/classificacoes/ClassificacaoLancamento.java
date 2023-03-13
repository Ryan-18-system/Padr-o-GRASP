package br.edu.ifpb.locadora.classificacoes;

import br.edu.ifpb.locadora.abstracts.Classificacao;

public class ClassificacaoLancamento extends Classificacao {
    private static final int LANCAMENTO = 1;
    @Override
    public int getCódigoDePreço() {
        return LANCAMENTO;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        return diasAlugados * 3.00;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return diasAlugados > 1 ? 2 : 1;
    }
}
