package br.edu.ifpb.locadora.classificacoes;

public abstract class Classificacao {
    public   abstract int getCodigoDePreco();
    public abstract double getValorDoAluguel(int diasAlugados);
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return 1;
    }
}
