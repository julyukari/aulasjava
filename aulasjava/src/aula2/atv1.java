package aula2;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Digite o primeiro numero:");
		n1= entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		n2= entrada.nextInt();
		System.out.println("Digite o terceiro numer:");
		n3= entrada.nextInt();
		
		/*if(n1>n2 && n1>n3) {
			System.out.println("o maior número é %d,n1");
		}
		else if (n2>n1 && n2>n3) {
			System.out.println(" o maior número é %d,n2");
		}
		else {
			System.out.println("o maior numero é %d,n3");
		} */
		
		int resultado= (n1>n2 && n1>n3? n1 : n2>n1 && n2>n3 ? n2:n3);
		System.out.printf("o maior número é %d ", resultado);
		
		/*int resultado= Math.max(n1,Math.max(n2,n3)); */
	
		
		

		}
	}


