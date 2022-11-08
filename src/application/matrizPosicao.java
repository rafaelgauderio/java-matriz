package application;

import java.util.Scanner;

public class matrizPosicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe o tamanho n x m da matriz:");
		int i = 0, j = 0;
		System.out.println();
		System.out.print("Informe n: ");
		int n = sc.nextInt();
		System.out.printf("Informe m: ");
		int m = sc.nextInt();
		int[][] matriz = new int[n][m];

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d]", matriz[i][j] = i + 2 * j);
			}
			System.out.println();
		}

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d]", matriz[i][j]);
			}
			System.out.println();
		}

		int x;
		System.out.println("Informe um valor de x: ");
		x = sc.nextInt();
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] == x) {

					System.out.println("Position: " + i + "," + j + ":");

					if (j > 0) {
						System.out.println("left: " + matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("right: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("up: " + matriz[i - 1][j]);
					}
					if (i < matriz.length - 1) {
						System.out.println("down: " + matriz[i + 1][j]);
					}

				}
			}
		}

		sc.close();
	
	}
}
