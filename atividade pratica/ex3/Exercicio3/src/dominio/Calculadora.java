package dominio;

public class Calculadora {
	public double num1;
	public double num2;
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public void setNum2(double num) {
		this.num2 = num;
	}	
	public double getSoma() {
		double reult=0;
		reult = (this.num1 + this.num2);
		return reult;
	}
	public double getDivi() {
		double reult=0;
		reult = (this.num1 / this.num2);
		return reult;
	}
	public double getSub() {
		double reult=0;
		reult = (this.num1 - this.num2);
		return reult;
	}
	public double getMult() {
		double reult=0;
		reult = (this.num1 * this.num2);
		return reult;
	}
	public double getNum1() {
		return this.num1;
		
	}
	public double getNum2() {
		return this.num2;
		
	}
}
