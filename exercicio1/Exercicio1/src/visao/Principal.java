package visao;
import java.util.Scanner;

import dominio.Lampada;

public class Principal {

	public static void main(String[] args) {
		Lampada lam = new Lampada();
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		
		
		do {
			System.out.println("--------------Menu----------------");
			System.out.println("1 - Ligar lampada");
			System.out.println("2 - Desligar lampada");
			System.out.println("3 - Ver status da lampada");
			System.out.println("4 - Alterar potencia da lampada");
			System.out.println("5 - Ver potencia da lampada");
			System.out.println("6 - Sair");
			System.out.print("Escolha a opção desejada: ");
			op = teclado.nextInt();
			switch(op) {
				case 1: lam.ligar();
				break;
				case 2: lam.desligar();
				break; //****
				case 3: if(lam.estaLigada()) {
						System.out.println("A lampada esta ligada");
					}else {
						System.out.println("A lampada esta desligada");
					}
				break;
				case 4: System.out.print("Digite a nova potencia: ");
					lam.alterarPotencia(teclado.nextInt());
					System.out.println("Potencia alterada com sucesso!");
				break; //****
				case 5: System.out.println("A potencia da lampada e: " + lam.getPotencia());
				break; //****
				case 6: System.out.println("Programa finalizado.");
				break; //****
					
			}
			
			
		}while(op!=6);
		
		
		
	}

}
