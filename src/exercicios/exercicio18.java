package exercicios;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número entre 1 e 1000: ");
		int x = sc.nextInt();
		
		while (x < 1 || x > 1000) {
			System.out.println("O número informado não está entre 1 e 1000");
			System.out.print("Informe um número entre 1 e 1000: ");
			x = sc.nextInt();
		}
		
		for (int i=0; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
}
