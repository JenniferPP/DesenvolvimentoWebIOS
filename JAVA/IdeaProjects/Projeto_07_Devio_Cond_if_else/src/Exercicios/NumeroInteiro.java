package Exercicios;

import java.util.Scanner;

public class NumeroInteiro {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;
        int metade;

        System.out.println("Insira um número:");
        numero = entrada.nextInt();

        if (numero > 20){
            metade = numero / 2;
            System.out.println("A metade de " + numero + " é: " + metade);
        }
        else{
            System.out.println("O número é: " + numero);
        }
    }
}
