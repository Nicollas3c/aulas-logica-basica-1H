package exemplos;

import java.util.Scanner;

public class exemplo1 {
	public static void main(String[] args) {
		
		//Vetor
		int[] num = new int[10];
		
		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 10; x++) {
			System.out.println("Entre com um Valor");
			num[x] = tcd.nextInt();
		}
		
		//Saida de Dados
		for (int x = 0; x < 10; x--) {
			System.out.println(num[x]);

		}
		
	}
}