package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		if (num1 % num2 == 0) {
			System.out.printf("O %d � multiplo de %d", num1, num2);
		}
		else if (num2 % num1 == 0) {
			System.out.printf("O %d � m�ltiplo de %d", num2, num1);
		}
		else {
			System.out.printf("Os n�meros n�o s�o m�ltiplo", num1, num2);
		}
		
		
		sc.close();

	}

}
