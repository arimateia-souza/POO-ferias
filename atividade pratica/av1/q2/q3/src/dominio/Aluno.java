package dominio;

import java.util.ArrayList;

//Faça um algoritmo que receba as notas das três unidades da disciplina de POO cursada
//pela turma de férias do TADS da EAJ. Seu programa deve ser capaz de mostrar
//o nome e matrícula de cada aluno, e a nota em cada unidade, por aluno.
//Em seguida, o algoritmo deve exibir a média aritmética da turma. 
public class Aluno {
	private String nome;
	private String matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNota3() {
		return nota3;
	}
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	

	//public float calcularMedia(float media, int tam) {
		//float mediaTurma;
		//mediaTurma = media/tam;
		//return mediaTurma;
	//}
	
	

}
