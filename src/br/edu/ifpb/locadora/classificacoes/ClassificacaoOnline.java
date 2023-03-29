package br.edu.ifpb.locadora.classificacoes;

public class ClassificacaoOnline extends Classificacao {
    private static final int ONLINE = 3;
    @Override
    public int getCodigoDePreco() {
        return ONLINE;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        return diasAlugados > 3 ? diasAlugados * 3.00 : diasAlugados  * 4.00;
    }
}
