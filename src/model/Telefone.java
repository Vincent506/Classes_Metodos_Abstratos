package model;

public class Telefone extends Contato{
    protected String telefone;

    public String getTelefone(){return telefone;}

    public Telefone(String tipo,String telefone){
        super(tipo);
        this.telefone = telefone;
    }

    @Override
    public void exibir() {
        System.out.println("Esse contato é do tipo: "+tipo);
    }
}
