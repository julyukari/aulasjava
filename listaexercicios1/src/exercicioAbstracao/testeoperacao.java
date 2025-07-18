package exercicioAbstracao;

public class testeoperacao {
	
	public static void main(string[]args) {
		soma soma1= new soma();
		multiplicacao mult1= new multiplicacao();
		subtracao sub1= new subtracao();
		divisao div1=new divisao();
		double resp1=soma1.calcular(10, 2);
		double resp2=sub1.calcular(10, 2);
		double resp3=mult1.calcular(10, 2);
		double resp4=div1.calcular(10, 2);
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		System.out.println(resp4);
		
		
		
	}

}
