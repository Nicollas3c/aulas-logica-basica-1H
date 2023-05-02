package exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		//Variáveis
		String[][] NEI = new String[3][5];

		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 5; y++) {
				System.out.println("Digite 5 Nomes, 5 emails e 5 idades respectivamente");
				NEI[x][y] = tcd.next();
			}
		}

		//Saída de Dados
		for (int x = 0; x < 3; x++) {
			System.out.print("\n\t");
			for (int y = 0; y < 5; y++) {
				System.out.print(NEI[x][y] + "\t");

			}
		}
	}
}