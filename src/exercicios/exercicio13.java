package exercicios;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Informe um valor para x: ");
		x = sc.nextDouble();
		System.out.print("Informe um valor para y: ");
		y = sc.nextDouble();
		
		if (y == 0 & x > 0 || x < 0) {
			System.out.println("Eixo X");
		} else if (x == 0 & y > 0 || y < 0) {
			System.out.println("Eixo Y");
		} else if (x == 0 & y == 0) {
			System.out.println("Origem");
		} else if (x < 0 & y > 0) {
			System.out.println("Q2");
		} else if (x > 0 & y > 0) {
			System.out.println("Q1");
		} else if (x < 0 & y < 0) {
			System.out.println("Q3");
		} else if (x > 0 & y < 0) {
			System.out.println("Q4");
		}
	
		sc.close();
	}

}
