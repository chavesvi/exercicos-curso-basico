package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		if (num1 % num2 == 0) {
			System.out.printf("O %d é multiplo de %d", num1, num2);
		}
		else if (num2 % num1 == 0) {
			System.out.printf("O %d é múltiplo de %d", num2, num1);
		}
		else {
			System.out.printf("Os números não são múltiplo", num1, num2);
		}
		
		
		sc.close();

	}

}
