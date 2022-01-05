package exercicios;

import java.util.Arrays;

public class exercicio25 {

	public static void main(String[] args) {
		/* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo
		   tipo e tamanho e com os elementos do vetor A multiplicados por 2.*/
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[] b = new int[a.length];
		
		for (int i=0; i<a.length; i++) {
			b[i] = a[i] * 2;
		}
		
		System.out.println("A = " + Arrays.toString(a));
		System.out.println("B = " + Arrays.toString(b));
		 

	}

}
