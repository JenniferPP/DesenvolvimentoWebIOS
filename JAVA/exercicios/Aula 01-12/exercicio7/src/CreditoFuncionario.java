import java.util.Scanner;

public class CreditoFuncionario {
    public static void main(String[] args){
        double salario;
        double emprestimo;

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite seu salario ");
        salario = entrada.nextDouble();

        System.out.println ("Valor da prestação desejada: ");
        emprestimo = entrada.nextDouble();

        double prestacao = salario * 0.30;


        if(emprestimo <= prestacao){
            System.out.println("Empréstimo pode ser concedido!");
        }
        else{
            System.out.println("Empréstimo não pode ser concedido!!");
        }
    }


}
