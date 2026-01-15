package br.com.rev;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String  senha = new String();

        do{
            System.out.println("Insira a senha");
            senha = entrada.nextLine();
        } while(!senha.equalsIgnoreCase("98611314"));
    }

}
