package exercicioAbstracao;

public abstract class funcionario {
	String nome;
	double salario;
	
	public funcionario(String nome, double salario) {
	this.nome=nome;
	this.salario=salario;
	
	}
public abstract double calcularSalario(double bonus);	

}
