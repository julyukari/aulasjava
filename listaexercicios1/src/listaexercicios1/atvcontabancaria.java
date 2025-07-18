package listaexercicios1;

public class atvcontabancaria {
	public static void main(String[]args) {
		contabancaria minhaConta=new contabancaria();
		minhaConta.setnumeroConta("230695");
		minhaConta.depositoConta(40000);
		minhaConta.saqueConta(1000);
		System.out.println(minhaConta.getsaldo());
	}

}
