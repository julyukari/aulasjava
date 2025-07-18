package exercicioAbstracao;

public class gato extends animal {
	public gato(String nome) {
		super(nome);
	}
public void emitirSom() {
	System.out.println(nome + ":miau,miau");
	
}
}
