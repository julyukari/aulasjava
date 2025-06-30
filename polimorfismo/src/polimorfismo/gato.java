package polimorfismo;

public class gato extends animal {
	 public gato(String nome,  int idade) {
		 super(nome,idade);
		 
	 }
     public void comer(String comida) {
    	 System.out.printf("foi comer %s \n",comida);
     }
    	 public void comer(String nome,String comida) {
        	 System.out.printf("%s foi comer %s \n",nome,comida);
     }
}
