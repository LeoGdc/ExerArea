package calcArea;

import java.util.Scanner;

public class CalcArea {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String name;
		String resposta = "S";
		int largura, compri, result;

		System.out.println("-------------------------------");
		System.out.println("  Calculo de �rea de uma casa");
		System.out.println("-------------------------------");

		System.out.println("Qual o nome do c�modo?");
		name = leitor.next();

		System.out.println("Qual a largura?");
		largura = leitor.nextInt();

		System.out.println("Qual o comprimento?");
		compri = leitor.nextInt();

		leitor.close();

		result = largura * compri;

		System.out.println("A �rea do(a) " + name + " � de " + result + " metros quadrados");

		System.out.println("Voc� deseja calcular mais c�modos(S/N)?");
		resposta = leitor.next();

	}
}
