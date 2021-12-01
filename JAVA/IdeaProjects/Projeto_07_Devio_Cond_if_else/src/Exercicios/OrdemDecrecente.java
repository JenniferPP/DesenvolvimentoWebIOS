package Exercicios;
import java.util.Scanner;

public class OrdemDecrecente {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        int number1;
        int number2;

        System.out.println("Insira o primeiro número:");
        number1 = entrada.nextInt();

        System.out.println("Insira o segundo número:");
        number2 = entrada.nextInt();

        if (number1 > number2){
            System.out.println("Os números inseridos foram: " + number2 + " e " + number1);
        }
        else{
            System.out.println("Os números inseridos foram: " + number1 + " e " + number2);
        }
    }
}
