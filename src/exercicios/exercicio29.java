package exercicios;

import java.util.Arrays;

public class exercicio29 {

	public static void main(String[] args) {
		/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
		 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o 
		 * resto da divisão do respectivo elemento de A por 2.
		 */
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] b = new int[a.length];
		
		for (int i=0; i<a.length; i++) {
			b[i] = a[i] % 2;
		}
		
		System.out.println("A = " + Arrays.toString(a));
		System.out.println("B = " + Arrays.toString(b));
	}

}
