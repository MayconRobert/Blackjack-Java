import java.util.ArrayList;

public class JogadorMaquina extends Jogador {

    protected Boolean atualizarMao(ArrayList<Carta> maoJogador){
        setPontos(somar(maoJogador));
        return parar(getPontos());
    }

    protected Boolean parar(int pontos){
        if(pontos < 17){
            return true;
        }else{
            return false;
        }
    }

    protected ArrayList<Carta> mostrarMao(){
        return getMao();
    }

}
