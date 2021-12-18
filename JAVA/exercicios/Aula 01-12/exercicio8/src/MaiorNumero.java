import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro número:");
        num3 = entrada.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("O maior número é: " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("O maior número é: " + num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("O maior número é: " + num3);
        }
        else{
            System.out.println("Os números são iguais");
        }

    }
}
