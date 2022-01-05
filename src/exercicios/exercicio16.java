package exercicios;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a coordenada: ");
		int x = sc.nextInt(), y = sc.nextInt();
		
		while (x != 0 & y != 0) {
			if (x > 0 & y > 0) {
				System.out.println("Primeiro Quadrante");
				System.out.println("Digite a coordenada: ");
			} else if (x < 0 & y > 0) {
				System.out.println("Segundo Quadrante");
				System.out.println("Digite a coordenada: ");
			} else if (x < 0 & y < 0) {
				System.out.println("Terceiro Quadrante");
				System.out.println("Digite a coordenada: ");
			} else if (x > 0 & y < 0) {
				System.out.println("Quarto Quadrante");
				System.out.println("Digite a coordenada: ");			
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
