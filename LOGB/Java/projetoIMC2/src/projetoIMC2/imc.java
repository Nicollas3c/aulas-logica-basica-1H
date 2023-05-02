package projetoIMC2;

import java.util.Scanner;

public class imc {

 	public static void main(String[] args) {
		
		//Variáveis
		double peso;
		double altura;
		double imc;

		//Entrada de Dados
		Scanner tcd = new Scanner(System.in);

		System.out.println("Digite seu Peso e confirme");
		peso = tcd.nextDouble();

		System.out.println("Digite sua Altura e confirme");
		altura = tcd.nextDouble();

		//Cálculo
		imc = peso / (altura * altura);
		
		//Abaixo do Normal
		if (imc >= 18.0 && imc <= 20.0) {
		System.out.println("Seu Peso é Abaixo do Normal, IMC: " + imc);
		}

		//Normal
		else if (imc > 20.0 && imc <= 25.0) {
		System.out.println("Seu Peso está na Média Estimada, IMC: " + imc);
		}

		//Sobrepeso
		else if (imc > 25.0) {
		System.out.println("Você está em Sobrepeso, IMC: " + imc);
		}
		else {
			System.out.println("Criticalmente Abaixo do Peso");
		}
	}		
}