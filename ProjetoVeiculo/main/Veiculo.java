package main;

import java.util.ArrayList;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int maxPassageiros;
    private int qtdPassageiros;
    private int capacidadeCarro;
    private ArrayList<Passageiro> passageiros;

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
   
    public void setMaxPassageiros(int maxPassageiros){
        this.maxPassageiros = maxPassageiros;
    }
    public int getMaxPassageiros(){
        return this.maxPassageiros;
    }

    public void embarcarPassageiro(Passageiro passageiro){
        this.qtdPassageiros = 0;
        this.capacidadeCarro = getMaxPassageiros();
        if(this.passageiros==null){
            this.passageiros = new ArrayList<>();

        }

        if(qtdPassageiros <= capacidadeCarro){
            this.passageiros.add(passageiro);
            System.out.println("Passageiro "+passageiro.getNome()+" embarcado");
            //teste
            System.out.println("quantidade: "+ qtdPassageiros);
            qtdPassageiros++;
        } else {
            System.out.println("Carro cheio");
        }
    }

    public void mostraDadosPassageiros(){
        for(int i = 0; i < passageiros.size(); i++){
            System.out.println("\nNome: " + passageiros.get(i).getNome() + 
                               "\nLogradouro: " + passageiros.get(i).getEndereco().getLogradouro() +
                               "\nCEP: " + passageiros.get(i).getEndereco().getCep() +
                               "\nNúmero da Casa: " + passageiros.get(i).getEndereco().getNumeroDaCasa() + 
                               "\nCidade: " + passageiros.get(i).getEndereco().getCidade() +
                               "\nBairro: " + passageiros.get(i).getEndereco().getBairro() +
                               "\nCPF: " + passageiros.get(i).getCpf());
            System.out.println("\ni: "+ i +
            				   "\npassageiros.size: " + passageiros.size());
        }
    }
}