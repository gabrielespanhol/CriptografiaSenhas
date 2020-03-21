import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Senhas {

	public static void main(String[] args) {
		
		

		PilhaChar pilha = new PilhaChar();
		pilha.init();
		String senha = "minha#1234_4321";
		String senhaNova = "";
		String aux;
		
		senha = showInputDialog("informe a senha a ser criptografada");

		char[] charArray = senha.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			pilha.push(charArray[i]);
			aux = String.valueOf(charArray[i]); 
			if(aux.equals("#") || aux.equals("_")) {
				pilha.pop();
				senhaNova += pilha.esvazia();
				if(aux.equals("#")) {
					senhaNova += "#";
				}else if(aux.equals("_")) {
					senhaNova += "_";
				}
			}	 
		}
		
		senhaNova += pilha.esvazia();
		
		senhaNova = senhaNova.replace( 'a' , '@' );
		senhaNova = senhaNova.replace( 's' , '$' );
		senhaNova = senhaNova.replace( 'r' , '*' ); 
		senhaNova = senhaNova.replace( 'e' , '&' );
		senhaNova = senhaNova.replace( 'i' , '!' );
		senhaNova = senhaNova.replace( 'o' , '(' ); 
		senhaNova = senhaNova.replace( 'u' , '+' );
		
		senhaNova = senhaNova.toUpperCase();
		//System.out.println(senhaNova);
		
		showMessageDialog(null, senhaNova);
		

	}

}
