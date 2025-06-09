package model;

public class Pessoa{
   
    private String nome;
    private int max;
    private int cont;
    private Contato[] contatos;

    public Pessoa(String nome, int max){
        this.nome = nome;
        this.max = max;
        this.contatos = new Contato[max];
        cont = 0;
    }    
//setter e getters
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}
    public void setContato(Contato contato){this.contatos[cont] = contato;}
    public Contato[] geContato(){return contatos;}
    public int getMax(){return max;}
    public void setMax(int max){this.max = max;}
//adiciona um contato no vetor contatos
    public void adicionarContato( Contato c){
        if (cont < max) {
            contatos[cont] = c;
            cont++;           
        }else{
            System.out.println("Contatos cheio");
        }
    }

//retorna o vetor de contatos de um tipo
    public Contato[] getContatoTipo(String tipo){
        Contato[] tipados = new Contato[max];
            for (int i = 0; i < cont; i++) {
                if (contatos[i].getContato().equalsIgnoreCase(tipo)) {
                    tipados[i] = contatos[i];
                }
            }
            return tipados;
        }
    
//retorna uma verificação se a pessoa tem ou não contatos do tipo telefone
    public boolean possuiTelefone(){
        String cell = "telefone";
        Contato[] telefones = getContatoTipo(cell);
        boolean verification = false;
        if (telefones != null) {
            verification = true;
        }
        return verification;
    }
//retorna uma verificação se a pessoa tem ou não contatos do tipo email
    public boolean possuiEmail(){
        String mail = "email";
        Contato[] emails = getContatoTipo(mail);
        boolean verification = false;
        if (emails != null) {
            verification = true;
        }
        return verification;
    }

    public void exibirContatos(){
        for (int i = 0; i < cont; i++) {
            contatos[i].exibir();
        }
    }

    

}
