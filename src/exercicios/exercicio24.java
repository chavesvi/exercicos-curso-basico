package exercicios;

import java.util.Arrays;

public class exercicio24 {

	public static void main(String[] args) {
		/* Criar um vetor A com 5 elementos inteiros. Construir um vetor B 
		 * de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, 
		 * ou seja, B[i] = A[i]. 
		 */
		
		int[] a =  {1, 2, 3, 4, 5};
		
		int[] b = new int[5];
		
		for (int i=0; i<a.length; i++)  {
			b[i] = a[i];
		}
		
		System.out.println("A = " + Arrays.toString(a)); //método para printar um vetor 
		System.out.println("B = " + Arrays.toString(b));
		

	}

}
