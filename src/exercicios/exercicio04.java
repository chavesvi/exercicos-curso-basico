package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double valor, salario;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		salario = horas * valor;
		System.out.println("NUMBER: " + num);
		System.out.println("SALARY: U$ " + salario);
		
		
		sc.close();
	}

}
