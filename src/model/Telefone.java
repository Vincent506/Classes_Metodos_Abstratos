package model;

public class Telefone extends Contato{
    protected String telefone;

    public String getTelefone(){return telefone;}

    public Telefone(String telefone){
        super("telefone");
        this.telefone = telefone;
    }

    @Override
    public void exibir() {
        System.out.println("Esse contato é do tipo: "+getTelefone());
    }
}
