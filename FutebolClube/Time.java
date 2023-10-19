package FutebolClube;

import java.util.ArrayList;

public class Time {
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    Time(ArrayList<Jogador> jogadores){
        if(jogadores.size()>8){
            System.out.println("Digite até 8 jogadores");
        }else{
            this.jogadores = jogadores;
        }
    }
}
