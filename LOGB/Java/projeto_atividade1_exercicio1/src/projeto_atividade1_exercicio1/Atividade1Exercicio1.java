package projeto_atividade1_exercicio1;

import java.util.Scanner;

public class Atividade1Exercicio1 {
	public static void main(String[] args) {
		
		//Variáveis
		String nome;
		String sobrenome;
		String nomeCompleto;
		
		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite seu Primeiro Nome e confirme");
		nome = tcd.nextLine();
		System.out.println("Digite seu Primeiro Sobrenome e confirme");
	    sobrenome = tcd.nextLine();
		
		//Processamento
		nomeCompleto = nome  + ' ' + sobrenome;
	    
	    //Saída de Dados
		System.out.println("Seu Nome Completo: " + nomeCompleto);
	}

}
