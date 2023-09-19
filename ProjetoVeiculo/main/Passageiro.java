package main;

public class Passageiro {
    private String nome;
    private String cpf;
    private Endereco Endereco;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Endereco getEndereco(){
        return this.Endereco;
    }

    public void setEndereco(Endereco endereco){
        this.Endereco = endereco;
    }

}