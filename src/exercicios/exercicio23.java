package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		//Resolução da área de dois triângulos e checagem do maior
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		 
		System.out.println("Informe os lados do triângulo X: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double p = (a + b + c) / 2;
		double areaX = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Informe os lados do triângulo Y: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		p = (a + b + c) / 2;
		double areaY = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Área do X: " + areaX);
		System.out.println("Área do Y " + areaY);
		
		if (areaX > areaY) {
			System.out.println("MAIOR: X");
		} else {
			System.out.println("MAIOR: Y");
		}
		
		sc.close();
		
	}

}
