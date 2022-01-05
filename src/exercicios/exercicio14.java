package exercicios;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu salário? ");
		double salario = sc.nextDouble(), imposto;
		
		if (salario >= 0.00 & salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.00 & salario <= 3000.00) {
			imposto = (salario * 8) / 100;
			System.out.printf("R$ %.2f", imposto);
		} else if (salario > 3000.00 & salario <= 4500.00) {
			imposto = (salario * 18) / 100;
			System.out.printf("R$ %.2f", imposto);
		} else if (salario > 4500.00) {
			imposto = (salario * 28) / 100;
			System.out.printf("R$ %.2f", imposto);
		}
		
		sc.close();

	}

}
