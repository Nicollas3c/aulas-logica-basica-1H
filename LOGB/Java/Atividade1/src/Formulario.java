import javax.swing.JOptionPane;
public class Formulario {
          public static void main(String[] args) {

        	  //Variáveis
        	  String nome = "Nicollas Cardoso Cavalcante Correia";
        	  String eC = "Solteiro";
        	  String email = "nicollas3c@gmail.com";
	          int idade = 15;
	          double altura = 1.83;
	          
	          //Saída de Dados
	         JOptionPane.showMessageDialog(null, "Nome: " + nome);
	         JOptionPane.showMessageDialog(null, "Email: " + email);
	         JOptionPane.showMessageDialog(null, "Estado Civil: " + eC);
	         System.out.println("Idade: " + idade);
	         System.out.println("Altura: " + altura);
      }
}    