package calcArea;

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String name;
		String resposta = "S";
		int largura, compri, result;
		int cont = 0;

		System.out.println("-------------------------------");
		System.out.println("  Calculo de �rea de uma casa");
		System.out.println("-------------------------------");

		while (resposta.equals("S") || resposta.equals("s")) {

			System.out.println("Qual o nome do c�modo?");
			name = leitor.next();

			System.out.println("Qual a largura?");
			largura = leitor.nextInt();

			System.out.println("Qual o comprimento?");
			compri = leitor.nextInt();

			System.out.println("Voc� deseja calcular mais c�modos(S/N)?");
			resposta = leitor.next();

			result = largura * compri;

			cont = result + cont;
		}
		if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println("A �rea total da casa � " + cont + " metros quadrados.");
		} else {
			System.out.println("a letra n�o corresponde");
		}
		leitor.close();

	}

}
