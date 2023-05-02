package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		//Variáveis
		String[] nome = new String[5];

		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 5; x++) {
			System.out.println("Digite os Nomes");
			nome[x] = tcd.nextLine();
		}

		//Saída de Dados
		for (int x = 0; x < 5; x++) {
			System.out.println(nome[x] + " ");
		}
	}
}