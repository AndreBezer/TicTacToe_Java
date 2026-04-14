package Jogo;

public class Tabuleiro {
	
	//Cria o tabuleiro
	char[][] tabuleiro = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
	};

	//Pôe peça na posição linha - coluna
	public void ver_tabuleiro() {
		System.out.print("\n\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print("|\t" + tabuleiro[i][j] + "\t|");
			}
		System.out.println("\n");
		}
	}
	
	//altera a matriz origial com a posição da jogada
	public void registar_jogada(int i, int j, char peca) {
		tabuleiro[i][j] = peca;
	}
}
