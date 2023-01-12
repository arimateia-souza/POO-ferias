package dominio;

public class Aluno {
	public String nome;
	String matricula;
	public double prova1;
	public double prova2;
	public double trabalho;
	
	double mediaPonderada;
	
	public double media(double prova1, double prova2, double trabalho) {
		mediaPonderada = (((prova1*2.5)+(prova2*2.5)+(trabalho*2))/7);
		return mediaPonderada;
	}
	
	public double Final() {
		double Final;
		if (mediaPonderada >= 5.0) {
			Final = 10 - mediaPonderada;
		}else {
			Final = 0;	
		}
		
		return Final;
	}
	
	
	

}
