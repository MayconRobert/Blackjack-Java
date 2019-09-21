import java.util.ArrayList;

public class JogadorHumano extends Jogador {

    protected int atualizarMao(ArrayList<Carta> maoJogador){
        setPontos(somar(maoJogador));
        return getPontos();
    }

    protected ArrayList<Carta> mostrarMao(){
        return getMao();
    }
}
