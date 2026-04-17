package Jogo;

public class Tabuleiro {
	public int contador = 0;
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
		if (tabuleiro[i][j] != ' '){
			System.out.println("Posição ja ocupada!");
			System.out.println("Tente novamente");
		}
		else{
			tabuleiro[i][j] = peca;
			contador+=1;
		}
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
		// Diagonal
	    if (tabuleiro[0][2] != ' ' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
	        return tabuleiro[0][2];
	    }
	    
	    return ' ';
	}
}
