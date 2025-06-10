package model;

public class Agenda {
    private String proprietario;
    private Pessoa[] pessoas;
    private int max;
    private int cont;

    public Agenda(String proprietario, int max){
        this.proprietario = proprietario;
        this.max = max;
        cont = 0;
        this.pessoas = new Pessoa[max];
    }

    public void setProprietario(String proprietario){this.proprietario = proprietario;}
    public String getProprietario(){return proprietario;}
    public void setMax(int max){this.max = max;}
    public int getMax(){return max;}
    public void setCont(int cont) {this.cont = cont;}
    public int getCont(){return cont;}

    public void addPessoa(Pessoa p){
        if (cont<max) {
            pessoas[cont] = p;
            cont++;
        }else{
            System.out.println("Agenda Lotada!!!");
        }
    }

    public Pessoa buscarPessoa(String nome){
        Pessoa procurado = null;
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                procurado = pessoas[i];
            }
        }
        return procurado;
    }

    public void addContato(String nome, Contato c){
        Pessoa selecionado = buscarPessoa(nome);
        if (selecionado!=null) {
            selecionado.adicionarContato(c);
        }
    }
   
    public void exibirTodasPessoas(){
        String exibir = "==================AGENDA PESSOAL=================="
        +"\nProprietario: ";
        for (int i = 0; i < cont; i++) {
            System.out.println(exibir+pessoas[i].getNome());
            pessoas[i].exibirContatos();;
        }
    }

    public void exibirContatosPessoa(String nome){
        Pessoa escolhido = buscarPessoa(nome);
        System.out.println("Contatos de "+escolhido.getNome());
        escolhido.exibirContatos();
    }

    public void exibirPessoasComEmail(){
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].possuiEmail() == true) {
                System.out.println("Pessoas que possuem email: "+pessoas[i].getNome());
            }
        }
    }

    public void recuperarPessoaPorEmail(String email){
        for (int j = 0; j < cont; j++) {
            
            for (int i = 0; i < cont; i++) {
                if (pessoas[i].possuiEmail() == true) {
                    
                }
            }    
        }
        
        
    }
    
    public String recuperarPessoaPorTelefone(String telefone){
        String recuperado = null;
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].possuiTelefone() == true) {
                recuperado = pessoas[i].getNome();
            }
        }
        return recuperado;
    }

}
