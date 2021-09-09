package calcArea;

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String name;
		String resposta;
		int largura, compri, result, cont;

		System.out.println("-------------------------------");
		System.out.println("  Calculo de �rea de uma casa");
		System.out.println("-------------------------------");

		System.out.println("Qual o nome do c�modo?");
		name = leitor.next();

		System.out.println("Qual a largura?");
		largura = leitor.nextInt();

		System.out.println("Qual o comprimento?");
		compri = leitor.nextInt();

		result = largura * compri;

		System.out.println("A �rea do(a) " + name + " � de " + result + " metros quadrados");
		cont = result;

		System.out.println("Voc� deseja calcular mais c�modos(S/N)?");
		resposta = leitor.next();

		while (resposta.equals("S") || resposta.equals("s")) {

			System.out.println("Qual o nome do c�modo?");
			name = leitor.next();

			System.out.println("Qual a largura?");
			largura = leitor.nextInt();

			System.out.println("Qual o comprimento?");
			compri = leitor.nextInt();

			System.out.println("Voc� deseja calcular mais c�modos(S/N)?");
			resposta = leitor.next();

			cont = result + largura * compri;
		}
		if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println("A �rea total da casa � " + cont + " metros quadrados.");
		} else {
			System.out.println("a letra n�o corresponde");
		}
		leitor.close();

	}

}
