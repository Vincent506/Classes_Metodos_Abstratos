package model;

public class Email extends Contato{
    private String email;

    public String getEmail(){return email;}
    public Email(String email){super(email);}
    @Override
    public void exibir() {
        System.out.println("Email: "+getEmail());
        
    }
}
