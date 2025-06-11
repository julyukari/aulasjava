package aula2;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
	Scanner imput = new Scanner (System.in);
	int n1;
	System.out.println("digite um numero:");
    n1=imput.nextInt();
    
    switch(n1) {
    case 1:
		System.out.println("Hoje é domingo !");
		break;
    case 2:
		System.out.println("Hoje é segunda !");
		break;
	case 3:
		System.out.println("Hoje é terça !");
		break;
	case 4:
		System.out.println("Hoje é quarta !");
		break;
	case 5:
		System.out.println("Hoje é quinta !");
		break;
	case 6:
		System.out.println("Hoje é sexta!");
		break;
	case 7:
		System.out.println("Hoje é sábado !");
		break;
	default:
			System.out.println("número invalido");
	}
	}

}