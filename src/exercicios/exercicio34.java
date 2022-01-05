package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio34 {

	public static void main(String[] args) {
		/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um 
		 * grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior 
		 * idades e suas respectivas posições. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int menor = 99999, maior = -99999;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		
		for (int x: a) {
			if (x < menor) {
				menor = x;
			} else if (x > maior) {
				maior = x;
			}
		}
		
		System.out.println("A = " + Arrays.toString(a));
		System.out.println("A maior idade informada foi " + maior);
		System.out.println("A menor idade informada foi " + menor);
		
		sc.close();

	}

}
