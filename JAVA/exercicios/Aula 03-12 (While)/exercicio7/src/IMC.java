import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String pessoa;
        double peso;
        double altura;
        double imc;
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Digite seu nome: ");
            pessoa = entrada.next();


            System.out.println("Digte seu peso: ");
            peso = entrada.nextDouble();



            System.out.println("Digte sua altura: ");
            altura = entrada.nextDouble();
            contador++;

            imc = peso / (altura * altura);


            if (imc >= 16 && imc <= 17) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Classificação: Magreza grave");
            } else if (imc >= 17 && imc <= 18.5) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Classificação: Magreza leve");
            } else if (imc >= 18.5 && imc <= 25) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Classificação: Saudável");
            } else if (imc >= 25 && imc <= 30) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Classificação: Sobrepeso");
            } else if (imc >= 30 && imc <= 45) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Classificação: Obesidade grau I");
            } else if (imc >= 35 && imc <= 40) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Classificação: Obesidade grau II (Severa)");
            } else if (imc >= 10) {
                System.out.println(pessoa + " : seu IMC é de " + imc + " , ");
                System.out.println("Obesidade grau III (Mórbida)");
            }
        }
    }
}
