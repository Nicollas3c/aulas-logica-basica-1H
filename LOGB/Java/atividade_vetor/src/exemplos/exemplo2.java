package exemplos;

import java.util.Scanner;

public class exemplo2 {
	
	public static void main(String[] args) {
		
		//Matriz
		int[][] num = new int[3][3];
		
		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println("Entre com um Valor");
				num[x][y] = tcd.nextInt();
			}
		}
		//Saida de Dados
		for (int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println(num[x][y] + "\t ");
			}
		}
	}
}