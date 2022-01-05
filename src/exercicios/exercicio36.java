package exercicios;

import java.util.Scanner;

public class exercicio36 {

	public static void main(String[] args) {
		// Matriz
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), negativos=0;
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				int value = sc.nextInt();
				mat[i][j] = value;
				if (value < 0) {
					negativos += 1;
				}
			}
		}
		
		System.out.print("Diagonal princial: ");
		
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("Quantidade de valores negativos: " + negativos);
		
		sc.close();

	}

}
