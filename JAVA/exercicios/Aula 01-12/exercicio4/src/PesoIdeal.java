import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args){

        double altura;
        String sexo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu sexo (masculino ou feminino):");
        sexo = entrada.next();

        System.out.println("Insira sua altura: ");
        altura = entrada.nextDouble();

        if(sexo == "feminino"){
            double femi = 62.1 * altura;

            System.out.println("Seu peso ideal é: " + femi);
        }
        else{
            double mas = 72.1 * altura;

            System.out.println("Seu peso ideal é: " + mas);
        }
    }
}
