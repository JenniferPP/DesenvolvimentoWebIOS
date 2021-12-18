public class Metade {
    public static void main(String[] args){
        double num = 2;
        int contador = 10;

        while (contador <= 20){
            double metade = contador / num;

            System.out.println("A metade do número " + contador + " é " + metade);
            contador++;
        }
    }
}
