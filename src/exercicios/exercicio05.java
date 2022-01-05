package exercicios;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c1, q1, c2, q2;
		double v1, v2, vt;
		
		c1 = sc.nextInt();
		v1 = sc.nextDouble();
		q1 = sc.nextInt();
		
		c2 = sc.nextInt();
		v2 = sc.nextDouble();
		q2 = sc.nextInt(); 
		
		vt = (v1 * q1) + (v2 * q2);
		
		System.out.println("Os códigos: " + c1 + " e " + c2);
		System.out.println("VALOR TOTAL A PAGAR: R$ " + vt);
		
		sc.close();

	}

}
