package br.edu.ifpb.locadora.template;

import br.edu.ifpb.locadora.model.Aluguel;
import br.edu.ifpb.locadora.model.Cliente;

public class ExtratoHTML extends ExtratoTemplate {
    public ExtratoHTML(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String getFooter() {
        return
                "\n Voce acumulou <EM> "+ this.cliente.getPontosDeAlugadorFrequente()
                + " pontos </EM> de alugador frequente";
    }

    @Override
    public String getCabecalho() {
        return "<H1>Registro de Alugueis de <EM>" + this.cliente.getNome() +
                "</EM></H1><P>\n";
    }

    @Override
    protected String formater(Aluguel aluguel) {
        return aluguel.getDVD().getTitulo() + ": R$ " + aluguel.getValorDoAluguel() + "<BR>";
    }
}
