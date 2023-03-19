package br.edu.ifpb.locadora.services;

import br.edu.ifpb.locadora.impl.ExtratoService;
import br.edu.ifpb.locadora.model.Aluguel;

import java.util.Iterator;
import java.util.List;

public class ExtratoText implements ExtratoService {
    @Override
    public String extrato(List<Aluguel> aluguelList, String nomeCliente, int pontosDeAlugadorFrequente, double valorTotal) {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = aluguelList.iterator();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + nomeCliente+ fimDeLinha);
        while(alugueis.hasNext()){
            Aluguel aluguel = alugueis.next();
            resultado.append(aluguel.getDVD().getTitulo()).append(" ").append(aluguel.getValorDoAluguel()).append(fimDeLinha);

        }
        resultado.append("Valor total pago: R$ ").append(valorTotal).append(fimDeLinha);
        resultado.append("Voce acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");
        return resultado.toString();
    }
}
