import br.edu.ifpb.locadora.model.Aluguel;
import br.edu.ifpb.locadora.model.Cliente;
import br.edu.ifpb.locadora.model.DVD;
import br.edu.ifpb.locadora.model.Jogo;
import br.edu.ifpb.locadora.template.ExtratoHTML;
import br.edu.ifpb.locadora.template.ExtratoTEXTO;
import br.edu.ifpb.locadora.template.ExtratoTemplate;
import br.edu.ifpb.locadora.utils.Console;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");


        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", 0), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", 2), 2));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", 1), 30));
        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", 1), 4));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", 2), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", 0), 3));
        c1.adicionaAluguel(new Aluguel(new Jogo(3,"GTAV", Console.PS5),4));

        ExtratoTemplate extrato;
        extrato = new ExtratoTEXTO(c1);
        System.out.println(extrato.gerarExtrato());
        System.out.printf("======================================"+"\n");

        extrato = new ExtratoHTML(c1);
        System.out.println(extrato.gerarExtrato());

    }
}