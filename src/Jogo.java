import java.util.ArrayList;

public class Jogo {

	public static void main(String[] args) {
		
		Baralho baralho = new Baralho();
		ArrayList<Carta> deck;
		deck = baralho.gerarBaralho();
		for(int i=0; i<deck.size();i++) {
			System.out.println(deck.get(i).naipe + " : " + deck.get(i).valor);
		}

	}

}
