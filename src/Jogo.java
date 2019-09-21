import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Baralho baralho = new Baralho();
		ArrayList<Carta> deck;
		char parar = 's', mostrarMaos = 'n';
		Scanner scanner = new Scanner(System.in);
		JogadorHumano player = new JogadorHumano();
		JogadorMaquina bot = new JogadorMaquina();
		int vencedor = 0;

		deck = baralho.gerarBaralho();
		player.sacar(deck);
		player.sacar(deck);
		System.out.println("Duas cartas foram entregues...");
		System.out.println("Sua pontuação: " + player.atualizarMao(player.getMao()));

		while(Character.toLowerCase(parar) == 's'){
			System.out.println("\nSacar mais uma carta?(S - N)");
			parar = scanner.next().charAt(0);

			if(parar == 's'){
				player.sacar(deck);
				System.out.println("Sua pontuação: " + player.atualizarMao(player.getMao()));
			}
		}

		while(bot.atualizarMao(bot.getMao())){
			bot.sacar(deck);
		}

		vencedor = Regras.vencedor(player.getPontos(), bot.getPontos());
		if(vencedor == 0){
			System.out.println("\nAmbos os jogadores estouraram");
		}else if(vencedor == 1){
			System.out.println("\nO Player venceu, Parabéns!!!");
		}else if(vencedor == 2){
			System.out.println("\nO Bot venceu");
		}else{
			System.out.println("\nO jogo empatou");
		}

		System.out.println("Deseja mostrar as cartas de ambos os jogadores?(S - N)");
		mostrarMaos = scanner.next().charAt(0);

		if(Character.toLowerCase(mostrarMaos) == 's'){
			System.out.println("\n\n\n\n--------MÃO DO JOGADOR--------");
			for(int i=0; i<player.mostrarMao().size();i++) {
				System.out.println(player.mostrarMao().get(i).naipe + " : " + player.mostrarMao().get(i).valor);
			}
			System.out.println("\n\n--------MÃO DO BOT--------");
			for(int i=0; i<bot.mostrarMao().size();i++) {
				System.out.println(bot.mostrarMao().get(i).naipe + " : " + bot.mostrarMao().get(i).valor);
			}
			scanner.close();
		}
	}
}
