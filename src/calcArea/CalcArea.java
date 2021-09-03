package calcArea;

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String name;
		String resposta = "S";
		int largura, compri, result;

		System.out.println("-------------------------------");
		System.out.println("  Calculo de área de uma casa");
		System.out.println("-------------------------------");

		System.out.println("Qual o nome do cômodo?");
		name = leitor.next();

		System.out.println("Qual a largura?");
		largura = leitor.nextInt();

		System.out.println("Qual o comprimento?");
		compri = leitor.nextInt();

		leitor.close();

		result = largura * compri;

		System.out.println("A Área do(a) " + name + " é de " + result + " metros quadrados");

		System.out.println("Você deseja calcular mais cômodos(S/N)?");
		resposta = leitor.next();

	}
}
