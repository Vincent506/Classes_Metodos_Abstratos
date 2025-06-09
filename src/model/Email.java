package model;

public class Email extends Contato{
    protected String email;

   
    public Email(String email){
        super( "email");
        this.email = email;
    }
    public String getEmail(){return email;}
    @Override
    public void exibir() {
        System.out.println("Esse contato é do tipo: "+getEmail());
        
    }
}
