package exercicios;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("�MPAR");
		}
		
		
		sc.close();

	}

}
