package projeto_tabuada;

import java.util.Scanner;
                                 
public class Tabuada {

	public static void main(String[] args) {
		
		//Variaveis
		int num = 0;
		
		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);	
		System.out.println("Informe um número e Confirme");
		num = tcd.nextInt();
		
		//Saída de Dados
		System.out.println("Tabuada do " + num);
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println(num + " x " + tabuada + " = " + num*tabuada);
		}
	}
}