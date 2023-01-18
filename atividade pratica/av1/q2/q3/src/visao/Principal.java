package visao;
import java.util.Scanner;

import dominio.Aluno;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Aluno> lunos = new ArrayList();
		Aluno a1 = new Aluno();
		
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		//Aluno alun = null;
		
		
		do {
			System.out.println("--------------Menu----------------");
			System.out.println("1 - Cadastrar novo aluno");
			System.out.println("2 - Dados dos alunos");
			System.out.println("3 - Media aritmetica da turma");
			System.out.println("4 - Sair");
			System.out.print("Escolha a opcao desejada: ");
			op = teclado.nextInt();
			//limpar buffer
			teclado.nextLine();
			switch(op) {
				case 1: 
				Aluno emp = new Aluno();
				System.out.print("Digite o nome do aluno:");
				emp.setNome(teclado.nextLine());
				System.out.print("Digite o matricula do aluno:");
				emp.setMatricula(teclado.nextLine());
				System.out.print("Digite a nota 1 do aluno:");
				emp.setNota1(teclado.nextInt());
				System.out.print("Digite a nota 2 do aluno:");
				emp.setNota2(teclado.nextInt());
				System.out.print("Digite a nota 3 do aluno:");
				emp.setNota3(teclado.nextInt());
				
				System.out.println("Aluno cadastrado com sucesso!");
				
				lunos.add(emp);
					break;
						
				case 2: System.out.println("--------------------------------------");
				
				for (int i=0; i< lunos.size();i++) {
					System.out.println("Nome: "+ lunos.get(i).getNome());
					System.out.println("matricula do aluno: "+ lunos.get(i).getMatricula());
					System.out.println("Digite a nota 1 do aluno: "+ lunos.get(i).getNota1());
					System.out.println("Digite a nota 2 do aluno: "+ lunos.get(i).getNota2());
					System.out.println("Digite a nota 3 do aluno: "+ lunos.get(i).getNota3());		
				}
				break;
				
				case 3: System.out.println("-----Media aritmetica da turma-----");
				
				int tam;
				float media=0;
				tam = lunos.size();
				
				for (int i=0; i< lunos.size();i++) {
					
					media = (lunos.get(i).getNota1()+lunos.get(i).getNota2()+lunos.get(i).getNota3());	
				}
				System.out.println("Media da turma: "+media);
				//System.out.println("Media da turma: "+ a1.calcularMedia(media, tam));
				
				
				
					break;
				case 4: System.out.println("Programa finalizado!");
				break;	
				default: System.out.println("Opcao invalida, tente novamente!");
					
			}	
		}while(op!=4);
	}

	
}
