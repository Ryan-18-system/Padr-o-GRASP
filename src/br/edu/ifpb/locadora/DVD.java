package br.edu.ifpb.locadora;

import br.edu.ifpb.locadora.abstracts.Classificacao;
import br.edu.ifpb.locadora.classificacoes.ClassificacaoInfantil;
import br.edu.ifpb.locadora.classificacoes.ClassificacaoLancamento;
import br.edu.ifpb.locadora.classificacoes.ClassificacaoNormal;
import br.edu.ifpb.locadora.interfaces.Alugavel;

public class DVD implements Alugavel {
    private Classificacao classificacao;
    private int codigoDePreco;
    private final String titulo;

    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.setCodigoDePreco(codigoDePreco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodigoDePreco(int codigo) {
        if (codigo == 0) {
            this.classificacao = new ClassificacaoNormal();
        } else if (codigo == 1) {
            this.classificacao = new ClassificacaoLancamento();
        } else {
            this.classificacao = new ClassificacaoInfantil();
        }

    }

    public int getCodigoDePreco() {
        return classificacao.getCódigoDePreço();
    }

    public double getValorDoAluguel(int diasAlugados) {

        return this.classificacao.getValorDoAluguel(diasAlugados);

    }

    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return classificacao.getPontosDeAlugadorFrequente(diasAlugados);
    }
}
