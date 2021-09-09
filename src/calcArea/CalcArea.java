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
		System.out.println("  Calculo de área de uma casa");
		System.out.println("-------------------------------");

		while (resposta.equals("S") || resposta.equals("s")) {

			System.out.println("Qual o nome do cômodo?");
			name = leitor.next();

			System.out.println("Qual a largura?");
			largura = leitor.nextInt();

			System.out.println("Qual o comprimento?");
			compri = leitor.nextInt();

			System.out.println("Você deseja calcular mais cômodos(S/N)?");
			resposta = leitor.next();

			result = largura * compri;

			cont = result + cont;
		}
		if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println("A área total da casa é " + cont + " metros quadrados.");
		} else {
			System.out.println("a letra não corresponde");
		}
		leitor.close();

	}

}
