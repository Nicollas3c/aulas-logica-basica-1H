package exercicios;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		//Declarar vetor unidimensional
		int[] num = new int[10];
		
		//Capturar 10 Números pelo Teclado
		Scanner tcd = new Scanner(System.in);
		for (int x = 0; x < 10; x++) {
			System.out.println("Entre com um Valor");
			num[x] = tcd.nextInt();
		}
		
		//Mostrar Números na ordem inversa
		for (int x = 9; x >= 0; x--) {
			System.out.println(num[x]);
		}
	}
}