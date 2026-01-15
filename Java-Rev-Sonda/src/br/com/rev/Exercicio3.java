package br.com.rev;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o raio do circulo");
        Double valor01 = entrada.nextDouble();
        System.out.printf("Área e:  %.2f ", Math.PI * Math.pow(valor01, 2.0));
    }
}
