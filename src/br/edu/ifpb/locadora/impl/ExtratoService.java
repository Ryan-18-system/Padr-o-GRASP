package br.edu.ifpb.locadora.impl;

import br.edu.ifpb.locadora.model.Aluguel;

import java.util.List;

public interface ExtratoService {
    String extrato(List<Aluguel> aluguelList, String nomeCliente, int pontosDeAlugadorFrequente, double valorTotal);
}
