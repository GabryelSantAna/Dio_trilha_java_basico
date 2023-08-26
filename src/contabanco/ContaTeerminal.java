package contabanco;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class ContaTeerminal {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo!!");

		System.out.println();

		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();

		System.out.print("Por favor,digite o numero da Agencia:  ");
		String agencia = sc.next();
		
		
		System.out.print("Digite seu nome: ");
		String nomeCliente = sc.nextLine();
		sc.next();
		System.out.print("Digite seu saldo: ");
		double saldo = sc.nextDouble();
		
		conta ct = new conta(numero,agencia,nomeCliente,saldo);
		
		System.out.println();
		System.out.println(ct);

	}

}
