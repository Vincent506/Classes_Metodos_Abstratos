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
    public void getContatoTipo(String tipo){
            System.out.println("Contatos telefonicos:");
            for (int i = 0; i < cont; i++) {
                if (contatos[i].getContato().equalsIgnoreCase("telefone")) {
                    System.out.println(contatos[i]+" ->");    
                } 
            }
            System.out.println("Contatos de email:");
            for (int j = 0; j < cont; j++) {
                if (contatos[j].getContato().equalsIgnoreCase("email")) {
                 System.out.println(contatos[j]+" ->");
                }   
            }
        }
    
//retorna uma verificação se a pessoa tem ou não contatos do tipo telefone
    public boolean possuiTelefone(){
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].getContato().equalsIgnoreCase("Telefone")) {
                return false;
                
            }
        }
        return true;
    }
//retorna uma verificação se a pessoa tem ou não contatos do tipo email
    public boolean possuiEmail(){
        return true;
    }

}
