package exercicios;

import java.util.Arrays;

public class exercicio26 {

	public static void main(String[] args) {
		/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
		 * mesmo tipo e tamanho, sendo que cada elemento do vetor B dever� ser o
		 * quadrado do respectivo elemento de A.
		 */
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int[] b = new int[a.length];
		
		for (int i=0; i<a.length; i++) {
			b[i] = a[i] * a[i];
		}
		
		System.out.println("A = " + Arrays.toString(a));
		System.out.println("B = " + Arrays.toString(b));
		
		
	}

}
