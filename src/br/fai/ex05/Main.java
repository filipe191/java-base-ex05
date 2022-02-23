package br.fai.ex05;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}
	//ctrl + shift + f ajeita tudo
	
	private void start() {
		
		for (int i = 0; i <= 5; i++) {
			
			switch (i) {
			case 1:
				System.out.println("Primeira condiçao");
				break;
				
			case 4:
				System.out.println("Segunda Confição");
				break;
						
			default:
				System.out.println("Nao encontrou nenhuma opção");
				break;
				
			}
		}
	}

}
