package dominio;

public class Empregado {
	private String nome;
	private String departamento;
	private int horasTrbalhadasNoMes;
	private double salarioPorHora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getHorasTrbalhadasNoMes() {
		return horasTrbalhadasNoMes;
	}
	public void setHorasTrbalhadasNoMes(int horasTrbalhadasNoMes) {
		this.horasTrbalhadasNoMes = horasTrbalhadasNoMes;
	}
	public double getSalarioPorHora() {
		return salarioPorHora;
	}
	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	public double calculaSalarioMensal(int horasTrbalhadas, double salarioMes) {
		double salario;
		salario = (salarioMes * horasTrbalhadas);
		return salario;
	}
	//Mostra dados???
}
