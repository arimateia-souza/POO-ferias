package visao;
import java.util.Scanner;

import dominio.Empregado;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		Empregado emp = new Empregado();
		
		
		do {
			System.out.println("--------------Menu----------------");
			System.out.println("1 - Cadastrar novo empregado");
			System.out.println("2 - Dados");
			System.out.println("3 - Calcular Salario");
			System.out.println("4 - Sair");
			System.out.print("Escolha a opcao desejada: ");
			op = teclado.nextInt();
			//limpar buffer
			teclado.nextLine();
			switch(op) {
				
				case 1: System.out.print("Digite o nome do empregado:");
				emp.setNome(teclado.nextLine());
				System.out.print("Digite o departamento do empregado:");
				emp.setDepartamento(teclado.nextLine());
				System.out.print("Digite as horas trabalhadas por mes do empregado:");
				emp.setHorasTrbalhadasNoMes(teclado.nextInt());
				System.out.print("Digite o salario por hora do empregado:");
				emp.setSalarioPorHora(teclado.nextDouble());
					break;
				
				case 2: System.out.println("--------------------------------------");
					System.out.println("Nome do empregado: "+ emp.getNome());
				System.out.println("Departamento do empregado: "+ emp.getDepartamento());
				System.out.println("Horas trabalhadas por mes do empregado: "+ emp.getHorasTrbalhadasNoMes());
				System.out.println("Salario por hora do empregado: "+ emp.getSalarioPorHora());
				System.out.println("Salario mensal: " + emp.calculaSalarioMensal(emp.getHorasTrbalhadasNoMes(),emp.getSalarioPorHora()));
					break;
				case 4: System.out.println("Programa finalizado!");
					break;			
				default: System.out.println("Opcao invalida, tente novamente!");
					
			}	
		}while(op!=4);
	}
}

