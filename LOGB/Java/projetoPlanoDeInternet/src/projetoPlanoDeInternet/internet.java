package projetoPlanoDeInternet;

import java.util.Scanner;

public class internet {
		public static void main(String[] args) {
			
			//Variáveis
			int mb = 0;
			int meses = 0;
			int mbU = 0;
			
			//Entrada de Dados
			Scanner tcd = new Scanner(System.in);
			System.out.println("Digite sua Quota de Megabytes");
			mb = tcd.nextInt();
			System.out.println("Digite quantos Megabytes você usou");
			mbU = tcd.nextInt();
			System.out.println("Digite o Número de Meses do Plano");
			meses = tcd.nextInt();
			
			
			//Operação
			
			
			
			
			//Saída de Dados
			System.out.println("Você pode usar" + mbU + "Megabytes no Próximo mês");
			
		}
}
