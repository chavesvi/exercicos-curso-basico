package exercicios;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe tr�s n�meros: ");
		int quant = 3;
		int maximo = maior(quant);
		
		printar(maximo);
		
		
		sc.close();
		
	}

	public static int maior(int quantNums) {
		/*fun��o para descobrir o maior n�mero 
		 quantNums = quantidade de n�meros que ser�o recebido para a checagem
		 */
		
		Scanner sc = new Scanner(System.in);
		int maiorNum = 0;
	
		for (int i=0; i<quantNums; i++) {
			int num = sc.nextInt();
			if (i == 0) {
				maiorNum = num;
			}
			if (num > maiorNum) {
				maiorNum = num;
			}
			
		}
		sc.close();
		return maiorNum;
	}
	
	public static void printar(int x) {
		//fun��o para printar algo
		System.out.println(x);
	}
	
}
