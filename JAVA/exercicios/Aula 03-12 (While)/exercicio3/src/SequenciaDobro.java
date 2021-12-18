import java.util.Scanner;
public class SequenciaDobro {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 1;


        System.out.println("Insira um número: ");
        num = entrada.nextInt();

        while (contador <= 10){
            int dobro = (contador * num)  ;
            int resultado= dobro * 2;
            System.out.println("A sequencia é: " + resultado);
            contador++;


        }
    }
}
