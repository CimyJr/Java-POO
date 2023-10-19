package FutebolClube;
import java.lang.Math;
import java.util.Random;

public class Jogador{
    private String nome;
    private String nascimento;
    private String posicao;
    private Time time;
    private Time timeEmprestado;
    private int energia;

    Jogador(String nome, String nascimento, String posicao, Time time){
        this.nome = nome;
        this.nascimento = nascimento;
        this.posicao = posicao;
        this.time = time;
        this.energia = 100;
    }
    Jogador(String nome, String nascimento, String posicao, Time time, Time timeEmprestado){
        this.nome = nome;
        this.nascimento = nascimento;
        this.posicao = posicao;
        this.time = time;
        this.timeEmprestado = timeEmprestado;
        this.energia = 100;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTimeEmprestado() {
        return timeEmprestado;
    }
    public void setTimeEmprestado(Time timeEmprestado) {
        this.timeEmprestado = timeEmprestado;
    }

    int desgaste(){
        int min=0;
        int max=50;
        int rand = new Random();
        return 
    }
}