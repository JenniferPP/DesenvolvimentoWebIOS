import java.util.Scanner;

public class CalculoINSS {
    public static void main ( String [] args ) {
        double salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite o seu salário: ");
        salario = entrada.nextDouble();

        if(salario <= 600){
            System.out.println ("Isento");
        }
        else if(salario > 600 && salario <= 1200){
            double inss = salario * 0.2;
            double total = salario - inss;
            System.out.println ("Seu desconto é de: " + inss + "  - Total final: " + total);
        }
        else if(salario > 1200 && salario <= 2000){
            double inss = salario * 0.25;
            double total = salario - inss;

            System.out.println ("Seu desconto é de: " + inss + "  - Total final: " + total);
        }
        else{
            double inss = salario * 0.3;
            double total = salario - inss;

            System.out.println ("Seu desconto é de: " + inss + "  - Total final: " + total);
        }
    }
}
