import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args){
        int valor1;
        int valor2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digte o primeiro número:");
        valor1 = entrada.nextInt();

        System.out.println("Digte o segundo número:");
        valor2 = entrada.nextInt();


        if(valor1 == valor2){
            System.out.println("Os números " + valor1 + " e " + valor2 + " são iguais");
        }
        else if(valor1 > valor2){
            System.out.println("Número " + valor1 + " é maior que " + valor2);
        }
        else{
            System.out.println("Número " + valor2 + " é maior que " + valor1);
        }
    }
}
