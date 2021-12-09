import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Contando_Strings {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String letras = "ABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyz";
        int quant[] = new int[letras.length()];

        String txt;
        //String txtCap = txt.toUpperCase();


        // Recebendo texto do usuário
        System.out.println("Digte um texto aqui: ");
        txt = entrada.nextLine();

        System.out.println("A quantidade de caracteres é: " + txt.length());


        for(int a = 0; a < quant.length; a++){
            quant[a] = 0;
        };



        for(int i = 0; i < txt.length(); i++){
            for(int z =0; z < letras.length(); z++){
                if (txt.charAt(i) == letras.charAt(z)){
                    quant[z]++;
                }
            }
        }

        for (int j = 0; j < letras.length(); j++){
            System.out.println(letras.charAt(j) + " - " + quant[j]);
        }

    }
}
