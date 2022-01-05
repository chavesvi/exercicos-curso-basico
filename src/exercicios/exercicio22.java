package exercicios;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe três números: ");
		int quant = 3;
		int maximo = maior(quant);
		
		printar(maximo);
		
		
		sc.close();
		
	}

	public static int maior(int quantNums) {
		/*função para descobrir o maior número 
		 quantNums = quantidade de números que serão recebido para a checagem
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
		//função para printar algo
		System.out.println(x);
	}
	
}
