package br.com.tlmtech.teste;

import javax.swing.JOptionPane;

public class AnoBissexto {

	public static void main(String[] args) {
		
		int ano;
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano.: "));
		StringBuilder mensagem = new StringBuilder("");
		if ((ano % 400 == 0) || (ano % 4 == 0)){
			mensagem.append("O ano de "+ano +" é bissexto" );	
		}
	    else{
	    	mensagem.append("O ano de "+ano +" não é bissetxo" );			
		}
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
	}

}
