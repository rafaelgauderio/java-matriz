package application;

import java.util.Locale;

public class ProgramExemplo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String[][] matriz = new String[3][3];
		matriz[0][0] = "nome";
		matriz[0][1] = "Rafael";
		matriz[0][2] = "Juliana";
		matriz[1][0] = "nome";
		matriz[1][1] = "Claudia";
		matriz[1][2] = "Larissa";
		matriz[2][0] = "nome";
		matriz[2][1] = "Jonilson";
		matriz[2][2] = "Maria";

		System.out.println("\nImprimindo a Matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println(); // pular uma linha depois de percorrer todas as colunas daquela linha
		}

		Integer[][] matrizInteiros = new Integer[10][10];

		// setando os valores na matriz
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				matrizInteiros[i][j] = i + j;
			}
		}

		System.out.println("\nImprimindo a matriz de inteiros");
		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				if (matrizInteiros[i][j] <= 9) {
					System.out.print("[ " + matrizInteiros[i][j] + "]");
				} else {
					System.out.print("[" + matrizInteiros[i][j] + "]");
				}

			}
			System.out.println();
		}

	}

}
