package model;

public class Telefone extends Contato{
    private String telefone;

    public String getTelefone(){return telefone;}

    public Telefone(String telefone){super(telefone);}

    @Override
    public void exibir() {
        System.out.println("Telefone: "+getTelefone());
    }
}
