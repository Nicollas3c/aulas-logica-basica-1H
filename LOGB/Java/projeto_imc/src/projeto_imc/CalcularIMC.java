package projeto_imc;
import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String[] args) {
		
		//Índice da Massa Corporal
		//resultado <- peso / (altura * altura)

		//Declarar Váriaveis
				double altura;
				double peso;
				double imc;

		//Entrada de Dados
				Scanner tcd = new Scanner(System.in);
				System.out.println("Digite seu peso e confirme");
				peso = tcd.nextDouble();
				System.out.println("Digite sua altura e confirme");
				altura = tcd.nextDouble();
				
		//Processamento - Cálculo
			   imc = peso / (altura * altura);

		//Saída de Dados
		System.out.println("Seu IMC é: " + imc);	
	}
	
}