package visao;
import dominio.Calculadora;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int opc=0;
		String ope;
		
		
		do {
			System.out.println("-------Menu Principal-------");
			System.out.println("1 - Calcular valores");
			System.out.println("2 - Sair");
			
			
			System.out.print("Digite a opcao desejada:");
			opc = teclado.nextInt();
			switch(opc) {
				case 1: System.out.print("Digite o primeiro valor:");
					calc.setNum1(teclado.nextDouble());
					//limpar buffer
					teclado.nextLine();
					System.out.print("Digite o operador matematico:");
					ope = teclado.nextLine();
					System.out.print("Digite o segundo valor:");
					calc.setNum2(teclado.nextDouble());
					
					if(ope.equals("+")) {
						System.out.println("O resultado e: "+ calc.getSoma());
					}else if(ope.equals("-")){
						System.out.println("O resultado e: "+ calc.getSub());
					}else if(ope.equals("/")) {
						System.out.println("O resultado e: "+ calc.getDivi());	
					}else if(ope.equals("*")||ope.equals("x")||ope.equals("X")) {
						System.out.println("O resultado e: "+ calc.getMult());
					}
				break;
				case 2: System.out.println("Programa finalizado!");
				break;
				default: System.out.println("Opcao invalida, tente novamente!");
			}	
		}while(opc!=2);		
	}	
}