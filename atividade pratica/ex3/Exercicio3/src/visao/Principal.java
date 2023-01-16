package visao;
import dominio.Calculadora;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int op=0;
		
		
		do {
			System.out.println("-------Menu Principal-------");
			System.out.println("1 - Digitar primeiro valor");
			System.out.println("2 - Digitar segundo valor");
			System.out.println("3 - Somar valores");
			System.out.println("4 - Dividir valores");
			System.out.println("5 - Subtrair valores");
			System.out.println("6 - Multiplicar valores");
			System.out.println("7 - Sair");
			
			
			System.out.print("Digite a opcao desejada:");
			op = teclado.nextInt();
			switch(op) {
				case 1: System.out.print("Digite o primeiro valor:");
					calc.setNum1(teclado.nextDouble());
					System.out.println("Primeiro valor alterado para "+ calc.getNum1());
					break;
				case 2:System.out.print("Digite o segundo valor:");
					calc.setNum2(teclado.nextDouble());
					System.out.println("Segundo valor alterado para "+ calc.getNum2());
					break;
				case 3: System.out.println("O resultado e: "+ calc.getSoma());
					break;
				case 4: System.out.println("O resultado e: "+ calc.getDivi());
				break;
				case 5: System.out.println("O resultado e: "+ calc.getSub());
				break;
				case 6: System.out.println("O resultado e: "+ calc.getMult());
				break;
				case 7: System.out.println("Programa finalizado!");
				break;
				default: System.out.println("Opcao invalida, tente novamente!");
			}	
		}while(op!=7);		
	}	
}
