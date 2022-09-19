package exercício3.main;

import exercício3.model.Guerreiro;
import exercício3.model.Mago;
import exercício3.model.Personagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        int vida;
        int mana;
        float xp;
        int inteligencia;
        int forca;
        int level;
        int opt = 0;
        boolean continuar = false;
        int tipoPersonagem;
        int simNao;

        Mago mago = null;
        Guerreiro guerreiro = null;

        List<Personagem> time = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        while (opt != 5) {
            System.out.println("=============== T I M E ===============\n"
                    + "\n 1- Montar"
                    + "\n 2- Visualizar time completo "
                    + "\n 0- Sair \n");
            opt = ler.nextInt();

            if (opt == 0) {
                System.exit(0);
            }

            switch (opt) {
                case 1:
                    do {
                        System.out.println("_______________ CRIE O PERSONAGEM _______________");

                        do {
                            System.out.println("\nTipo de personagem: \n"
                                    + "1- Mago\n2- Guerreiro");
                            tipoPersonagem = ler.nextInt();
                        } while (tipoPersonagem != 1 && tipoPersonagem != 2);

                        System.out.print("Nome: ");
                        nome = ler.next();

                        System.out.print("Vida: ");
                        vida = ler.nextInt();

                        System.out.print("Mana: ");
                        mana = ler.nextInt();

                        System.out.print("XP: ");
                        xp = ler.nextFloat();

                        System.out.print("Inteligência: ");
                        inteligencia = ler.nextInt();

                        System.out.print("Força: ");
                        forca = ler.nextInt();

                        System.out.print("Level: ");
                        level = ler.nextInt();

                        if (tipoPersonagem == 1) {
                            mago = new Mago(nome, vida, mana, xp, inteligencia, forca, level);
                            time.add(mago);
                        } else if (tipoPersonagem == 2) {
                            guerreiro = new Guerreiro(nome, vida, mana, xp, inteligencia, forca, level);
                            time.add(guerreiro);
                        };

                        do {
                            System.out.println("\n\nGostaria de adicionar mais algum personagem ao time?\n"
                                    + "1- Sim\n2- Não");
                            simNao = ler.nextInt();

                            if (simNao == 1) {
                                continuar = true;
                            } else if (simNao != 1 && simNao != 2) {
                                System.out.println("\n\n**********Opção inválida, tente novamente!**********\n\n");
                            } else {
                                continuar = false;
                            };
                        } while (simNao != 1 && simNao != 2);

                    } while (continuar == true);
                    break;

                case 2:
                    if (time.isEmpty() == false) {
                        for (int i = 0; i < time.size(); i++) {
                            System.out.println(time.get(i).toString());
                        }
                        System.out.println("\nNúmero de magos no time: " + mago.totalMago());
                        System.out.println("\nNúmero de guerreiros no time: " + guerreiro.totalGuerreiro());
                        System.out.println("\nNúmero total de integrantes do time: " + (mago.totalMago() + guerreiro.totalGuerreiro()) + "\n\n");
                    } else {
                        System.out.println("Time sem integrantes!\n\n");
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n\n**********Opção inválida, tente novamente!**********\n\n");
            }
        }
    }
}
