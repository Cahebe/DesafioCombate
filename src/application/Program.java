package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();
		System.out.println(" ");

		Champion champion1 = new Champion(name, life, attack, armor);

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		System.out.println(" ");

		Champion champion2 = new Champion(name2, life2, attack2, armor2);

		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		sc.nextLine();
		System.out.println(" ");

		for (int i = 0; i < rounds; i++) {
			if  (champion1.getLife() > 0 & champion2.getLife() > 0) {
				System.out.println("Resultado do turno " + (i + 1));
				champion1.takeDamage(champion2);
				System.out.println(champion1.status());
				champion2.takeDamage(champion1);
				System.out.println(champion2.status());
				System.out.println(" ");
			}  else  {
				i += 100000;
			}
		}

		System.out.println("Fim do combate!");

		sc.close();

	}

}
