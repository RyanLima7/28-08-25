package aula_27_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		ArrayList<Pessoa> banco = new ArrayList<>();
		ArrayList<Pessoa> cache = new ArrayList<>();

		// Dados mockados
		banco.add(new Pessoa(1, "Carlos", 20));
		banco.add(new Pessoa(2, "Ana", 30));
		banco.add(new Pessoa(3, "Ryan", 22));
		banco.add(new Pessoa(4, "Caue", 19));
		banco.add(new Pessoa(5, "Kenps", 39));

		Scanner scanner = new Scanner(System.in);
		int opcao;

		// MENU exibido uma única vez
		System.out.println("\n\t == MENU BANCO ==");
		System.out.println("1. Verificar pessoa por ID");
		System.out.println("2. Verificar o cache");
		System.out.println("3. Sair");

		do {
			System.out.print("\nEscolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o ID da pessoa que deseja buscar: ");
				int idBuscado = scanner.nextInt();
				System.out.println("Você digitou o ID: " + idBuscado); // <- LINHA ADICIONADA

				// Verificar no cache primeiro
				Pessoa encontradaNoCache = null;
				for (Pessoa p : cache) {
					if (p.getId() == idBuscado) {
						encontradaNoCache = p;
						break;
					}
				}

				if (encontradaNoCache != null) {
					System.out.println("Pessoa encontrada no cache: ");
					System.out.println("\n" + encontradaNoCache);
				} else {
					// Buscar no banco
					Pessoa encontradaNoBanco = null;
					for (Pessoa p : banco) {
						if (p.getId() == idBuscado) {
							encontradaNoBanco = p;
							break;
						}
					}

					if (encontradaNoBanco != null) {
						if (cache.size() == 10) {
							cache.remove(0); // remove a mais antiga
						}
						cache.add(encontradaNoBanco);
						System.out.println("Pessoa buscada no banco e adicionada ao cache: ");
						System.out.println("\n" + encontradaNoBanco);
					} else {
						System.out.println("Pessoa com ID " + idBuscado + " não encontrada no banco.");
					}
				}
				break;

			case 2:
				System.out.println("\nCache atual:");
				if (cache.isEmpty()) {
					System.out.println("Cache está vazio.");
				} else {
					for (Pessoa p : cache) {
						System.out.println(p);
					}
				}
				break;

			case 3:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 3);

		scanner.close();
	}
}
