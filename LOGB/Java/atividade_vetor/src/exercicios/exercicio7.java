package exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		//Variáveis
		String[] nome = new String[5];
		double[] num = new double[3];
		double media = 0;
		
		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 3; x++) {
			System.out.println("Digite 3 Notas");
			num[x] = tcd.nextDouble();
			media = (num[x] + num[x] + num[x]) / 3;
		}
		
		//Operação
		for (int n = 0; n < 5; n++) {
			System.out.println("Digite 5 Nomes");
			nome[n] = tcd.next();
			System.out.println(nome[n] + " " + media);
		}
	}
}