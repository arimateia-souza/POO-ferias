package visao;
import java.util.Scanner;
import dominio.Aluno;


public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		a1.nome = teclado.nextLine();
		System.out.print("Digite a nota 1 do aluno "+ a1.nome + ": ");
		a1.prova1 = teclado.nextDouble();
		System.out.print("Digite a nota 2 do aluno "+ a1.nome + ": ");
		a1.prova2 = teclado.nextDouble();
		System.out.print("Digite a nota do trabalho do aluno "+ a1.nome + ": ");
		a1.trabalho = teclado.nextDouble();
		
		System.out.println("-----Informaçoes do aluno-----");
		System.out.println("Nome: "+ a1.nome);
		System.out.println("Media: "+ a1.media(a1.prova1, a1.prova2, a1.trabalho));
		System.out.println("Precisa de "+a1.Final() + " na 4 prova");
		
		
		
		
	}

}
