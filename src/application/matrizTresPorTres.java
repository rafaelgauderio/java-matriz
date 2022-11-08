package application;

import java.util.Scanner;

public class matrizTresPorTres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe o tamanho n da matriz:");

		int n = sc.nextInt();	
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = i + j;
			}
		}
		//matriz n x n
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("[%d]", matriz[i][j] = i + j);

			}
			System.out.println();

		}

//diagonais	
		System.out.println();
		System.out.print("Os valores dos elementos da diagonal principal são: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.printf("[%d] ", matriz[i][j]);
				}

			}

		}

		System.out.println();
		System.out.print("Os valores dos elementos da diagonal secundária são: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1 - i) {
					System.out.printf("[%d] ", matriz[i][j]);
				}

			}

		}
		// segunda matriz
		System.out.println();
		System.out.println();
		System.out.println("A segunda matriz é: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i - 3*j;
			}

		}
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d]", matriz[i][j]);
				if (matriz[i][j] < 0) {
					cont++;
				}
			

			}
			System.out.println();
			
				}
		System.out.println("O número de valores negativos da segunda matriz é: " + cont);

		sc.close();
		
		
	}
}
