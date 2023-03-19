package br.edu.ifpb.locadora.services;

import br.edu.ifpb.locadora.impl.ExtratoService;
import br.edu.ifpb.locadora.model.Aluguel;

import java.util.Iterator;
import java.util.List;

public class ExtratoHtml implements ExtratoService {


    @Override
    public String extrato(List<Aluguel> aluguelList, String nomeCliente, int pontosDeAlugadorFrequente, double valorTotal) {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = aluguelList.iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" + nomeCliente +
                "</EM></H1><P>" + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            // mostra valores para este aluguel
            resultado += cada.getDVD().getTitulo() + ": R$ " + cada.getValorDoAluguel() + "<BR>"+ fimDeLinha;
        }
        resultado += "<P>Valor total pago: <EM>R$ " + valorTotal +
                "</EM>"+ fimDeLinha;
        resultado += "<P>Voce acumulou <EM>" +
                pontosDeAlugadorFrequente +
                " pontos </EM> de alugador frequente";
        return resultado;
    }
}
