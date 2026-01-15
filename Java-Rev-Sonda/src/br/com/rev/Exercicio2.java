package br.com.rev;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Double valueOne, valueTwo;
        System.out.println("Entre com o valor para subtração");
        valueOne = input.nextDouble();
        valueTwo = input.nextDouble();
        System.out.printf("Soma %.2f", valueOne - valueTwo);
        input.close();
    }
}
