public class ExpressaoLogica {
    public static void main (String[] args){
        int a1 = 120-30;
        int a2 = 3 ^ 30;
        int b1 = 20 % 4;
        int b2 = 9;
        int c1 = 5 % 22;
        char d1 = 'a';
        char d2 = 'A';

        System.out.println("O resultado é:" + ((a1) == (a2)));
        System.out.println("O resultado é:" + (!((b1)==1) || (b2 != b2)));
        System.out.println("O resultado é:" + ((c1) > 3));
        System.out.println("O resultado é:" + (d1 == d2));
    }
}
