package br.edu.ifpb.locadora.template;

import br.edu.ifpb.locadora.model.Aluguel;
import br.edu.ifpb.locadora.model.Cliente;
import java.util.Iterator;

public abstract class ExtratoTemplate {

    private final String separador = System.getProperty("line.separator");
    protected Cliente cliente;

    protected StringBuilder resultado;
    public ExtratoTemplate(Cliente cliente){
        this.cliente = cliente;
        this.resultado = new StringBuilder();
    }
    public abstract String getFooter();
    public abstract  String getCabecalho();
    public String gerarExtrato(){
        Iterator<Aluguel> alugueis = cliente.getDvdsAlugados().iterator();
        resultado.append(getCabecalho());
        while(alugueis.hasNext()){
            Aluguel aluguel = alugueis.next();
            resultado.append(formater(aluguel)).append(separador);

        }
        resultado.append(getFooter()).append(separador);
        return resultado.toString();
    }

    protected abstract String  formater(Aluguel aluguel);
}
