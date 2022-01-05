package exercicios;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} 
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
