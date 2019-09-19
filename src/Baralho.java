import java.util.ArrayList;
import java.util.Collections;

public class Baralho{

	//0=Ás, 11 = Dama, 12 = Valete, 13 = Rei
	private int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private String[] naipes = {"ESPADA", "OURO", "COPAS", "PAUS"};
	private ArrayList<Carta> deck = new ArrayList<Carta>();
	
	protected ArrayList<Carta> gerarBaralho() {
		for(int i=0; i < valores.length; i++) {
			for(int j=0; j < naipes.length; j++) {
				deck.add(new Carta(naipes[j], i));
			}
		}
		Collections.shuffle(deck);
		return deck;
	}	
	
	

}
