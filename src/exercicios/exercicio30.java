package exercicios;

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		/* Criar um vetor A com 10 elementos inteiros. Implementar um programa
		 * que defina e escreva a quantidade de elementos armazenados neste vetor que
		 * são pares.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int pares = 0;
		
		System.out.println("Informe 10 valores: ");
		for (int i=0; i<a.length; i++) {
			System.out.print((i + 1) + "º valor: ");
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<a.length; i++) {
			if (a[i] % 2 == 0) {
				pares += 1;
			}
		}
		
		System.out.println(pares + " VALORES PARES.");
		
		sc.close();

	}

}
