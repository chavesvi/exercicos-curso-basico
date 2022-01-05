package exercicios;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Alcool 2.Gasolina 3. Diesel");
		int tipo = sc.nextInt(), alcool = 0, gasolina = 0, diesel = 0;
		
		while (tipo !=  4) {
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}
			System.out.println("1.Alcool 2.Gasolina 3. Diesel");
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		
		sc.close();
	}

}
