package br.edu.principal;

import br.edu.pacoteDois.Button;
import br.edu.pacoteDois.TextField;
import br.edu.pacoteUm.Evento;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Define-se um botão e o comportamento quando o mesmo for usado!!
		 */
		Button botao = new Button();
		botao.addEvento(new Evento(){

			@Override
			public void Executar() {
				System.out.println("Este botão acaba de ser clicado!!");
			}
			
		});
		
		/**
		 * Define-se um textfield e o comportamento quando o mesmo for usado!!
		 */
		TextField textFieldUm = new TextField();
		textFieldUm.addEvento(new Evento(){

			@Override
			public void Executar() {
				System.out.println("Este textField acaba de ser preenchido!!");
			}
			
		});
		
		TextField textFieldDois = new TextField();
		textFieldDois.addEvento(new Evento(){

			@Override
			public void Executar() {
				System.out.println("Outro textfield com outro comportamento... Texto diferente!!");
			}			
			
		});
		
	}

}
