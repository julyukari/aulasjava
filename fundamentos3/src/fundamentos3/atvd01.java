package fundamentos3;

public class atvd01 {
    public static void main(String[] args) {
	  	String str = new String();
		String texto="hello mundo";
		str=texto.replace("hello","olá");
		System.out.println(str);
		System.out.println(3+str+" "+texto);
		
		
		
	    str=texto.substring(2);
	    str=texto.substring(2,9);
	    System.out.println(str);
	    
	    

	}

}
