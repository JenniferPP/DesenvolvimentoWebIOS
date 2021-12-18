import java.util.Scanner;

public class OrdemDescrecente {
    public static void main(String[] args){
        int valor1;
        int valor2;
        int ordem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digte o primeiro número:");
        valor1 = entrada.nextInt();

        System.out.println("Digte o segundo número:");
        valor2 = entrada.nextInt();

        if (valor1 > valor2){
            System.out.println("Ordem descrecente: " + valor2 + " , " + valor1);
        }
        else{
            System.out.println("Ordem descrecente: " + valor1 + " , " + valor2);
        }
    }
}
