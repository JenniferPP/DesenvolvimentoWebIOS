import java.util.Scanner;

public class LerNumeros {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int number;
        int numLimite = 1;

        System.out.println("Digite um número:");
        number = entrada.nextInt();

        for (numLimite = 1; numLimite <= number; numLimite++){
            System.out.println(numLimite);
        }
    }
}
