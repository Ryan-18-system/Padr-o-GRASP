package br.edu.ifpb.locadora.impl;

public interface Alugavel {
    String getTitulo();
    double getValorDoAluguel(int diasAlugados);
    int getPontosDeAlugadorFrequente(int diasAlugados);
}
