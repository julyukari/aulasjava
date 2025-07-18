package exercicioAbstracao;

public class Gerente extends funcionario implements bonificavel{
   public Gerente(String nome, double salario) {
		super(nome, salario);
		

double bonus,salario;

@Override
public double calcularBonus() {
	bonus=this.salario*0.1;
	return bonus;
}
	
	
}

@Override
public double calcularSalario(double bonus) {
	
	return salario=this.salario+bonus;
}
	
}
