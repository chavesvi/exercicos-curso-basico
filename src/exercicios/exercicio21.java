package exercicios;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de divisões: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double dividendo = 0, divisor = 0;
			System.out.print("Informe o dividendo: ");
			dividendo = sc.nextInt();
			System.out.print("Informe o divisor: ");
			divisor = sc.nextInt();
			if (divisor != 0) {
				double div = dividendo / divisor;
				System.out.println("Resultado = " + div);
			} else {
				System.out.println("Divisão impossível.");
			}
				
		}
		sc.close();
	}

}
