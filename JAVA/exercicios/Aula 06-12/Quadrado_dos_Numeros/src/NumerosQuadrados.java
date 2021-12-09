public class NumerosQuadrados {
    public static void  main (String[] args){
        int resultado;
        int number = 15;

        for(number = 15; number <= 100; number++ ){
            resultado = (number * number);
            System.out.println("O número quadrado de " + number + " é:" + resultado);
        }


    }
}
