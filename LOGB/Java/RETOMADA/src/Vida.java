import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vida { 
   public static void main(String[ ] args) {
	   // VARIÁVEIS
	  
	   
	   // Tipo primitivo C/C++	   
	   // Numérico
	   int idade = 15;
	   long CodigoDeBarras = 123123123;
	   float altura = 1.67f;
	   double salario = 23423.80;
	   
	   // Textos
	   char status = 'A';
	   byte letra = '0';
	   String Palavra = "Palavra";
	   
	   //Lógico / Boleano
	   boolean ocupado = true;
	   boolean stuação = false;
	   int ativo = 1;
	   
	   // Saída de Dados
	   System.out.println("O salario é " + salario);
	   JOptionPane.showMessageDialog(null, "A altura é " + altura);
	   
	   //Entrada de Dados
	   Scanner teclado = new Scanner(System.in);
	   System.out.println("Digite o CEP");
	   String cep = teclado.next();
	   
	   //Entrada de Dados Visual 
	   String cep2 = JOptionPane
	    .showInputDialog("Entre com CEP");
   }
}
