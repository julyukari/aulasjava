package exercicioAbstracao;

public class testeanimal {
	
	 public static void main(String[]args) {
		 gato animal1=new gato("Floquinho");
		 String animais[]= {"caramelo,floquinho,jujuba,miaur"};
		 for(String n:animais) {
			 animal1.emitirSom(n);
		 }
	 }

}
