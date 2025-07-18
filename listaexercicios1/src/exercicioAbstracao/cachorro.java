package exercicioAbstracao;

public class cachorro extends animal{
	public cachorro(String nome) { 
		super(nome);
	}
	public void emitirSom(String nome) {
		System.out.printf("%s está latindo auauau",nome);
		
	}

    }
