package br.edu.ifpb.locadora.template;

import br.edu.ifpb.locadora.model.Aluguel;
import br.edu.ifpb.locadora.model.Cliente;

public class ExtratoTEXTO extends ExtratoTemplate{
    public ExtratoTEXTO(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String getFooter() {
        return "Voce acumulou " + this.cliente.getPontosDeAlugadorFrequente()+ " pontos de alugador frequente";
    }

    @Override
    public String getCabecalho() {
        return "Registro de Alugueis de " + cliente.getNome();
    }

    @Override
    protected String formater(Aluguel aluguel) {
        return aluguel.getDVD().getTitulo() + " " + aluguel.getValorDoAluguel();
    }
}
