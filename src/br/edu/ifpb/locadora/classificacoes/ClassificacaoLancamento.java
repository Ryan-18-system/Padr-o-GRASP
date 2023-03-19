package br.edu.ifpb.locadora.classificacoes;

public class ClassificacaoLancamento extends Classificacao {
    private static final int LANCAMENTO = 1;
    @Override
    public int getCodigoDePreco() {
        return LANCAMENTO;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        return diasAlugados > 3 ? diasAlugados * 3.00 : diasAlugados  * 4.00;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return diasAlugados > 1 ? 2 : 1;
    }
}
