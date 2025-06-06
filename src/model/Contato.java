package model;

public abstract class Contato {
    protected String tipo;

    public String getContato(){return tipo;}

    public Contato(String tipo){this.tipo = tipo;}

    public abstract void exibir();
}
