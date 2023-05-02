package projeto_atividade1_exercicio2;

import java.util.Scanner;

public class Atividade1Exercicio2 {
	public static void main(String[] args) {
		
		//Variáveis
		int num1;
		int num2;
		int resultado;
		
		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite um Número e confirme");
		num1 = tcd.nextInt();
		System.out.println("Digite um Número e confirme");
		num2 = tcd.nextInt();
		
		//Cálculo
		resultado = num1 + num2;
		
		//Saída de Dados
		System.out.println("O resultado é: " + resultado);
		
	}

}
