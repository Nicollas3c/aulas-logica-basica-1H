package entrada_processamento_saida;

import java.util.Scanner;

public class nome {
public static void main(String[] args) {
	
	//Nome e Sobrenome
	
	//Variáveis
	String nome;
	String sobrenome;
	
	// Entrada de Dados
	Scanner tcd = new Scanner(System.in);
	System.out.println("Digite seu Nome e pressione ENTER");
    nome = tcd.next();
    System.out.println("Digite seu último Sobrenome e pressione ENTER");
    sobrenome = tcd.next();
    
    //Concatenação
    
    //Saída de Dados
    System.out.println("Seu nome : " + nome + ' ' + sobrenome);
	
}
}
