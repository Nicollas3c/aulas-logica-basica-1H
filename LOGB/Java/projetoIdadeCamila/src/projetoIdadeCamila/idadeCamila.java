package projetoIdadeCamila;

import java.util.Scanner;

public class idadeCamila {
	
	public static void main(String[] args) {
 		
	//Variáveis
	int idade1;
	int idade2;
	int idade3;
	
	//Entrada de Dados
	Scanner tcd = new Scanner(System.in);
	System.out.println("Digite um Número e Confirme");
	idade1 = tcd.nextInt();
	System.out.println("Digite um Número Inteiro e Confirme");
	idade2 = tcd.nextInt();
	System.out.println("Digite um Número Inteiro e Confirme");
	idade3 = tcd.nextInt();

	//Operação
	if (idade1 <= idade2 & idade2 <= idade3) {
		System.out.println("A Idade de Camila é: " + idade2);		
		}
	else if (idade2 <= idade3 & idade3 <= idade1) {
		System.out.println("A Idade de Camila é: " + idade3);
		}
	else if (idade3 <= idade1 & idade1 <= idade2) {
		System.out.println("A Idade de Camila é: " + idade1);		
		}
	}
}                                                              