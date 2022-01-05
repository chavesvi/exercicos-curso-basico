package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio32 {

	public static void main(String[] args) {
		/* Criar um vetor A com 10 elementos  inteiros. Implementar um programa
		 * que determine a soma dos elementos armazenados neste vetor que são
		 * múltiplos de 5.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0;
		
		System.out.println("Informe 10 valores: ");
		
		for (int i=0; i<a.length; i++) {
			System.out.print((i + 1) + "º valor: ");
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<a.length; i++) {
			soma += multiplos(a[i]);
		}
		
		System.out.println("A = " + Arrays.toString(a));
		System.out.println("A soma dos elementos múltiplos de 5 é " + soma);
		
		sc.close();

	}
	
	public static int multiplos(int num) {
		if (num % 5 == 0) {
			return num;
		} else {
			return 0;
		}
	}

}
