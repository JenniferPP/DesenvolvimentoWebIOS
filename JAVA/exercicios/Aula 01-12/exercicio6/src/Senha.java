import java.util.Scanner;

public class Senha {
    public static void main(String[] main){
        String senha;

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite a senha: ");
        senha = entrada.next();

        if(senha.equals("R10p5")){
            System.out.println("Acesso concedido");
            boolean resultado = senha == "R10p5";
        }
        else{
            System.out.println("Acesso negado");
            boolean resultado = senha == "R10p5";
        }

    }
}
