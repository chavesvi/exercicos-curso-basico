package exercicios;

import java.util.Scanner;

public class exercicio31 {
	
	public static void main(String[] args) {
		/* Criar um vetor A com 10 elementos inteiros. Implementar um programa
		 * que defina e escreva a soma de todos os elementos armazenados neste vetor.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0, contagem = 1;
		
		System.out.println("Informe 10 valores: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(contagem + "º valor: ");
			a[i] = sc.nextInt();
			contagem += 1;
		}
		
		for (int x: a) {
			soma += x;
		}
		
		System.out.println("A soma é dos valores é " + soma);
		
		sc.close();
	}
}
