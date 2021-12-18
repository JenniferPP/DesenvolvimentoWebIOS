import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 1;
        int par = 0;
        int impar = 0;


        while (contador <= 10){
            System.out.println("Informe um número:");
            num = entrada.nextInt();
            contador++;

            if(num % 2 == 0){
                par = par +1;
            }
            else{
                impar = impar + 1;
            }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
}

