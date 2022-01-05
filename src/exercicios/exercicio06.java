package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, circ, trap, qua, ret;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		tri = (a * c) / 2;
		circ = Math.PI * Math.pow(c, 2);
		trap = ((a + b) * c) / 2;
		qua = Math.pow(b, 2);
		ret = a * b;
		System.out.printf("TRIÂNGULO = %.3f\n", tri);
		System.out.printf("CÍRCULO = %.3f\n", circ);
		System.out.printf("TRAPÉZIO = %.3f\n", trap);
		System.out.printf("QUADRADO = %.3f\n", qua);
		System.out.printf("RETÂNGULO = %.3f\n", ret);
		
		sc.close();
		
	}

}
