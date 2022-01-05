package exercicios;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quant, cod;
		double total;
		
		System.out.print("Informe o código do produto: ");
		cod = sc.nextInt();
		System.out.print("Informe a quantidade: ");
		quant = sc.nextInt();
		
		switch (cod) {
		case 1:
			total = quant * 4.0;
			break;
		case 2:
			total = quant * 4.5;
			break;
		case 3:
			total = quant * 5.0;
			break;
		case 4:
			total = quant * 2.0;
			break;
		case 5: 
			total = quant * 1.5;
			break;
		default:
			total = 0.0;
			break;
		}
	
	System.out.printf("O valor total a ser pago é: R$ %.2f", total);
		
	sc.close();
	}

}
