package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		//Variáveis
		int[][] num = new int[3][3];

		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.println("Digite os Números");
				num[x][y] = tcd.nextInt();
			}
		}

		//Saída de Dados
		for (int x = 0; x < 3; x++) {
			System.out.print("\n\t");
			for (int y = 0; y < 3; y++) {
				System.out.print(num[x][y] + "\t");

			}
		}
	}
}