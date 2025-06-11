package aula2;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite a primeira letra :");
		char letra= entrada.next().charAt(0);
        System.out.println(letra=='f'?"feminino":"masculino");
	}

}
