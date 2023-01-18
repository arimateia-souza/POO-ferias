package dominio;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if ((this.dia == 0) && (this.mes==0) && (this.ano==0)) {
			this.dia = 01;
			this.mes = 01;
			this.ano = 0001;
		}
	}
	
	

}
