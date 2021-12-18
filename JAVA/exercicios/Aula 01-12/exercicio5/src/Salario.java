import java.util.Scanner;

public class Salario {
    public static void main(String[] args){
        double bonus1 = 0.20;
        double bonus2 = 0.10;
        int tempoTrabalho;
        double salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu tempo de trabalho:");
        tempoTrabalho = entrada.nextInt();

        System.out.println("Insira seu salário atual:");
        salario = entrada.nextDouble();

        if(tempoTrabalho >= 5){
            double acrescimo = salario * bonus1;
            double total = acrescimo + salario;

            System.out.println("Seu bônus é de: " + acrescimo + " - Total final: " + total);

        }
        else{
            double acrescimo2 = salario * bonus2;
            double total2 = acrescimo2 + salario;

            System.out.println("Seu bônus é de: " + acrescimo2 + " - Total final: " + total2);
        }

    }
}
