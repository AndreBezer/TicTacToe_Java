package Jogo;

public class Tabuleiro {
	
	char[][] tabuleiro = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
	};

	public void ver_tabuleiro() {
		System.out.print("\n\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print("|\t" + tabuleiro[i][j] + "\t|");
			}
		System.out.println("\n");
		}
	}
		
	public void registar_jogada(int i, int j, char peca) {
		tabuleiro[i][j] = peca;
	}
	
	public char verificarVencedor() {
		for (int i = 0; i < 3; i++) {
			// Linhas
			if (tabuleiro[i][0] != ' ' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
				return tabuleiro[i][0];
			}
			// Colunas
			if (tabuleiro[0][i] != ' ' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
				return tabuleiro[0][i];
			}
		}
		// Diagonal
		if (tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
	        return tabuleiro[0][0];
	    }
	    if (tabuleiro[0][2] != ' ' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
	        return tabuleiro[0][2];
	    }
	    
	    return ' ';
	}
}
