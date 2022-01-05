package exercicios;

import java.util.Scanner;

public class exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de valores e dejesa verificar: ");
		int n = sc.nextInt(), in = 0, out = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Informe os valores: ");
			int x = sc.nextInt();
			if (x >= 10 & x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
