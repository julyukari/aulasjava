package aula2;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
	Scanner imput = new Scanner (System.in);
	System.out.println("digite a primeira nota:");
    double nota1=imput.nextDouble();
    System.out.println("digite a segunda nota:");
    double nota2=imput.nextDouble();
    double media =(nota1+nota2)/2;
    System.out.printf("sua media é %f", media);
	}

}
