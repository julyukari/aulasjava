package exercicioAbstracao;

public class testefuncionario {
	
	public static void main(String []args) {
		gerente g1= new garente ("Polly",5000);
		programador p1=new programador ("Gustavo",5000);
		
		g1.calcularBonus();
	    double salarioprogramador=p1.calcularSalario(p1.calcularbonus());
	    System.out.printf("O salariode %s é %f",p1.nome,salarioprogramador);
	    

}
