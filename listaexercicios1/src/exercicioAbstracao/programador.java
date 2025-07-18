package exercicioAbstracao;

public class programador extends funcionario implements bonificavel {
    double bonus,salario;
	public programador(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public double calcularBonus() {
		bonus=this.salario*0.1;
		return bonus;
		
		
	}

	@Override
	public double calcularSalario(double bonus) {
	    
		
		return salario=this.salario+bonus;
	}

}
