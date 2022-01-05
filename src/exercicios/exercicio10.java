package exercicios;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e a hora final: ");
		int hInicial = sc.nextInt(), hFinal = sc.nextInt(), hTotal = 24;
		
		if (hInicial < 0 || hInicial >= 24 || hFinal < 0 || hFinal >= 24){
			System.out.println("Horário inválido");
		} else if (hInicial > hFinal){
			hTotal -= (hInicial - hFinal);
			System.out.printf("O horário total do jogo é de %d horas", hTotal);
		} else {
			hTotal -= (hFinal - hInicial);
			System.out.printf("O horário total do jogo é de %d horas", hTotal);
		}
		
		
		sc.close();
	}

}
