import java.util.Scanner;

public class Intervalo {
    public static void main (String[] args){
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digte um número:");
        numero = entrada.nextInt();

        if(numero >= 50 & numero <= 100){
            System.out.println("Pertence ao intervalo");
        }
        else{
            System.out.println("Não pertence ao intervalo");
        }
    }

}
