package projetoFatorial;

import java.util.Scanner;

public class fatorial {
      public static void main(String[] args) {
		
    	  //Variável
    	  int num1 = 1;
    	  int num2 = 1;
    	  
    	  //Entrada de Dados
    	  Scanner tcd = new Scanner(System.in);
    	  System.out.println("Digite um Numero e Confirme");
    	  num1 = tcd.nextInt();
    	  num2 = num1;
    	  
    	  //Saída de Dados
    	  while (num2 > 1) {
    		  	num1 = num1 * (num2 - 1); num2--;
    		  	System.out.println(num1);
    	  }
      }
  }