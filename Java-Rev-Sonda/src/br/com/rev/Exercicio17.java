package br.com.rev;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor01 = entrada.nextInt();
        int valor02 = entrada.nextInt();

        while (valor01 != 0 && valor02 != 0) {
            if (valor01 > 0 && valor02 > 0) {
                System.out.println("primeiro");
            }
            else if (valor01 < 0 && valor02 > 0) {
                System.out.println("segundo");
            }
            else if (valor01 < 0 && valor02 < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            valor01 = entrada.nextInt();
            valor02 = entrada.nextInt();
        }

        entrada.close();

    }
}
