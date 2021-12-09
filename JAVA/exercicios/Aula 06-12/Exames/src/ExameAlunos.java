import java.util.Scanner;
public class ExameAlunos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int aluno1;
        int aluno2;
        int aluno3;
        int aluno4;
        int aluno5;
        int aluno6;
        //int[] alunos = new int[6] ;
        int nota1;
        int nota2;
        int media;

        for(){
            System.out.println("Digte o nome do aluno:");
            aluno1 = entrada.nextInt();

            System.out.println("Digte a primeira nota do " + aluno1 + " :");
            nota1 = entrada.nextInt();

            System.out.println("Digte a segunda nota do " + aluno1 + " :");
            nota2 = entrada.nextInt();

            media = (nota1 + nota2)/2;

            System.out.println("A nota do aluno é: " );

            if(media <= 3){
                System.out.println("Reprovado");
            }
            else if(media > 3 & media < 7){
                System.out.println("Exame");
            }
            else{
                System.out.println("Aprovado");
            }
        }
    }
}
