import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 1;

        while (contador <=10){
            System.out.println("Insira um número: ");
            num = entrada.nextInt();
            contador++;
        }
        if (num < num){
            System.out.println("O menor número é: " + num);
        }
    }
}
