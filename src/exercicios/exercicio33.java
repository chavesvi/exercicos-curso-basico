package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio33 {

	public static void main(String[] args) {
		/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa 
		 * que defina o percentual de elementos pares e ímpares, respectivamente,
		 * armazenados neste vetor.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int perPar = 0, perImpar = 0;
		
		System.out.println("Informar 10 valores: ");
		for (int i=0; i<a.length; i++) {
			System.out.print((i + 1) + "º valor: ");
			a[i] = sc.nextInt();
		}
		
		for (int x: a) {
			if (x % 2 == 0) {
				perPar += 10;
			} else {
				perImpar += 10;
			}
		}
		
		System.out.println("A = " + Arrays.toString(a));
		System.out.println(perPar + "% de pares");
		System.out.println(perImpar + "% de ímpares");
		
		sc.close();

	}

}
