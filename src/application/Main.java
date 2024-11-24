package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        System.out.println();

        Champion championOne = new Champion(name, life, attack, armor);

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();

        System.out.print("Ataque: ");
        attack = sc.nextInt();

        System.out.print("Armadura: ");
        armor = sc.nextInt();

        System.out.println();

        Champion championTwo = new Champion(name, life, attack, armor);

        System.out.print("Quantos turnos você deseja executar? ");
        int rounds = sc.nextInt();

        for (int i = 0; i < rounds; i++) {
            championOne.takeDamage(championTwo);
            championTwo.takeDamage(championOne);

            System.out.printf("%nResultado do turno %d:%n", i + 1);
            System.out.println(championOne.status());
            System.out.println(championTwo.status());

            if(championOne.getLife() <= 0 || championTwo.getLife() <= 0){
                break;
            }
        }

        System.out.printf("%nFIM DO COMBATE");

        sc.close();
    }
}