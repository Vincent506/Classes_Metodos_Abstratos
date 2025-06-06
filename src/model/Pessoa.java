package model;

public class Pessoa extends Contato {
    private Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nome, int max, String tipo){
        this.nome = nome;
        this.max = max;
        super(tipo);
    }

    @Override
    public void exibir() {
    }

    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}
    public void setContato(Contato contato){this.contatos[cont] = contato;}
    
    public int getMax(){return max;}
    public void setMax(int max){this.max = max;}
//adiciona um contato no vetor contatos
    public void adicionarContato( Contato c){
        setContato(c);
        cont++;
    }
//retorna o vetor de contatos por completo
    public void getContat0(){
        System.out.println("Contatos: ");
        for (int i = 0; i < cont; i++) {
            Contato index = contatos[i];
            System.out.print(index+" ->");
        }
    }
//retorna o vetor de contatos de um tipo
    public void getContatoTipo(String tipo){
        String mail = "email";
        String cell = "telefone"; 
        if (tipo.equalsIgnoreCase(cell)) {
            System.out.println("Contatos telefonicos:");
            for (int i = 0; i < cont; i++) {
                System.out.println(contatos[i]+" ->");
            }
        }else if (tipo.equalsIgnoreCase(mail)) {
            System.out.println("Contatos de email:");
            for (int i = 0; i < cont; i++) {
                System.out.println(contatos[i]+" ->");
            }
        }
    }
//retorna uma verificação se a pessoa tem ou não contatos do tipo telefone
    public boolean possuiTelefone(){
        return true;
    }
}
