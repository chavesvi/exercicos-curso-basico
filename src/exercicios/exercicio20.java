package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantindade de casos: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Informe o 1º valor: ");
			double v1 = sc.nextDouble();
			System.out.print("Informe o 2º valor: ");
			double v2 = sc.nextDouble();
			System.out.print("Informe o 3º valor: ");
			double v3 = sc.nextDouble();
			double mp = ((2 * v1) + (3 * v2) + (5 * v3)) / 10;	
			System.out.printf("%.1f %n", mp);
			
		}
		
		sc.close();
	}

}
