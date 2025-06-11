import java.util.Scanner;

import model.Agenda;
import model.Contato;
import model.Email;
import model.Pessoa;
import model.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda("ADM", 20);
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Vicente", 5);
        Pessoa p2 = new Pessoa("robert", 6);
        Pessoa p3 = new Pessoa("maria", 7);
        Pessoa p4 = new Pessoa("carla", 8);

        agenda.addPessoa(p1);
        agenda.addPessoa(p2);
        agenda.addPessoa(p3);
        agenda.addPessoa(p4);

        System.out.println("Buscar robert "+agenda.buscarPessoa("Robert"));

        Contato c1 = new Telefone("Telefone", "981770621");
        Contato c2 = new Email("Email", "teste@gmail.com");

        agenda.addContato("robert", c1);
        agenda.addContato("maria", c2);

        agenda.exibirTodasPessoas();

        agenda.exibirContatosPessoa("robert");

        agenda.exibirPessoasComEmail();

        agenda.recuperarPessoaPorEmail("teste@gamil.com");
        agenda.recuperarPessoaPorTelefone("981770621");

        sc.close();
    }
}
    