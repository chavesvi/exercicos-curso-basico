package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio35 {

	public static void main(String[] args) {
		/* Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar
		 * as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva 
		 * um programa que calcule a média aritmética simples das notas informadas
		 * armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. 
		 * Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada  
		 * for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação
		 * do aluno será “reprovado”. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		for (int i=0; i<10; i++) {
			System.out.print("Informe a 1º nota do aluno " + (i + 1) + ": ");
			nota1[i] = sc.nextDouble();
			System.out.print("Informe a 2º nota do aluno " + (i + 1) + ": ");
			nota2[i] = sc.nextDouble();
		}
		
		for (int i=0; i<10; i++) {
			result[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		int contagem = 1;
		System.out.println("STATUS DOS ALUNOS: ");
		for (double x: result) {
			System.out.print("Aluno " + contagem + ": ");
			if (x >= 7) {
				System.out.println("APROVADO!");
			} else {
				System.out.println("REPROVADO!");
			}
			contagem += 1;
		}
		
		sc.close();

	}

}
