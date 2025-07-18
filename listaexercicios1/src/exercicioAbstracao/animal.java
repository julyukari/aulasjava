package exercicioAbstracao;

public abstract class animal {
	String nome;
public animal(String nome) {
	this.nome=nome;
}
public abstract void emitirSom(String nome);

public void dormir() {
	System.out.println(nome +"Está dormindo.");
}
}
