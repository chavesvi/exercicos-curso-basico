package exercicios;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("N�O NEGATIVO");
		} 
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
