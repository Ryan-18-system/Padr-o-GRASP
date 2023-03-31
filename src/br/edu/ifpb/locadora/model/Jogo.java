package br.edu.ifpb.locadora.model;

import br.edu.ifpb.locadora.classificacoes.*;
import br.edu.ifpb.locadora.utils.Console;
import br.edu.ifpb.locadora.impl.Alugavel;

public class Jogo implements Alugavel {
    private Classificacao classificacao;
    private int codigoDePreco;
    private final String titulo;
    private Console console;

    public Jogo(int codigoDePreco, String titulo, Console console) {
        this.titulo = titulo;
        this.console = console;
        this.setCodigoDePreco(codigoDePreco);
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    public void setCodigoDePreco(int codigoDePreco) {
        if (codigoDePreco == 0) {
            this.classificacao = new ClassificacaoNormal();
        } else if (codigoDePreco == 1) {
            this.classificacao = new ClassificacaoLancamento();
        } else {
            this.classificacao = new ClassificacaoOnline();
        }
        this.codigoDePreco = codigoDePreco;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        return this.classificacao.getValorDoAluguel(diasAlugados);
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return classificacao.getPontosDeAlugadorFrequente(diasAlugados);
    }
}
