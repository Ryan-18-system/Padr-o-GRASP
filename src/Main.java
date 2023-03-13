import br.edu.ifpb.locadora.Aluguel;
import br.edu.ifpb.locadora.Cliente;
import br.edu.ifpb.locadora.DVD;
import br.edu.ifpb.locadora.classificacoes.ClassificacaoInfantil;
import br.edu.ifpb.locadora.classificacoes.ClassificacaoLancamento;
import br.edu.ifpb.locadora.classificacoes.ClassificacaoNormal;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");

        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", 0), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", 2), 2));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", 1), 30));
        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", 1), 4));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", 2), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", 0), 3));

        System.out.println(c1.extrato());
    }
}