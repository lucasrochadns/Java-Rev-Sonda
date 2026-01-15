package br.com.rev;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valueFatorial = entrada.nextInt(); entrada.nextLine();
        System.out.println(fatorial(valueFatorial));

    }

    public static long fatorial(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fatorial(n -1);
    }
}
