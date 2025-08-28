package aula_27_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pessoa> banco = new ArrayList<>();

		ArrayList<Pessoa> cache = new ArrayList<>();

		banco.add(new Pessoa(1, "Carlos", 20));
		banco.add(new Pessoa(2, "Ana", 30));
		banco.add(new Pessoa(3, "Ryan", 22));
		banco.add(new Pessoa(4, "Caue", 19));
		banco.add(new Pessoa(5, "Kenps", 39));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem-vindo(a) ao nosso Menu ");
		System.out.println("\nDigite a opção do que quer fazer hoje");
		System.out.println("Digite abaixo");
		System.out.println("\n\t == MENU BANCO ==");
		System.out.println("Opções:");
		System.out.println("\n1.Verificar ID");
		System.out.println("2.Verificar o seu Cache");
		System.out.println("3.Sair");

		int id = scanner.nextInt();

		switch (id) {

		case 1:
		System.out.println("Os ID's disponíveis são : ");
		System.out.println("\n1, "+ "Carlos, "+"20");
		
	
		case 2:
			System.out.println("2, "+ "Ana, "+"30");
			
		case 3:
			System.out.println("3, "+ "Ryan, "+"22");
			
		case 4:
			System.out.println("4, "+ "Caue, "+"19");
			
		case 5:
			System.out.println("5, "+ "Kenps, "+"39");
			
		}
	}

}
