package Program;

import java.util.Scanner;
import Jogo.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro game = new Tabuleiro();
		
		game.ver_tabuleiro();
		
		
		while(true) {
			if(game.contador > 9) {
				break;
			}
			if (game.contador % 2 == 0) {
				System.out.println("Jogador 1");
				System.out.print("Digite o local para jogar X (1-3): ");
				int l = sc.nextInt();
				int c = sc.nextInt();
				
				game.registar_jogada(l-1,  c-1,  'X');
				game.ver_tabuleiro();
				
			}
			
			else {
				System.out.println("Jogador 2");
				System.out.print("Digite o local para jogar O (1-3): ");
				int l = sc.nextInt();
				int c = sc.nextInt();
				
				game.registar_jogada(l-1,  c-1,  'O');
				
				game.ver_tabuleiro();
			}
			
			char vencedor = game.verificarVencedor();
			
			if (vencedor != ' ') {
				System.out.println("O vencedor foi o jogaor '" + vencedor + "'");
				break;
			}

		}
		
		
		sc.close();
	}
}
