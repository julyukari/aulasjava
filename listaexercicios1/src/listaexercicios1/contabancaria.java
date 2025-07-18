package listaexercicios1;

public class contabancaria {
	private String numeroConta;
	private double saldo;
	
public String getNumeroConta() {
       return numeroConta;
       
}
      public void setnumeroConta(String numeroConta) {
    	  this.numeroConta = numeroConta;
    	  
      }
public double getsaldo() {
	return saldo;
}
      public void setsaldo(double saldo ) {
    	  this.saldo= saldo;
    	  
      }
public void saqueConta(double valor) {
	if(saldo>0 && saldo>=valor) {
		this.saldo-=valor;
	}else {
		System.out.println("não há valor na sua conta");
		
}
	
}
public void depositoConta(double valor) {
	if(valor > 0) {
		this.saldo+=valor;
	}else {
		System.out.println("Deposite um valor válido");
}
}
}
	