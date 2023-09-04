public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 30;
        int tal2 = 3;

        int summa_addition = tal1 + tal2;
        int summa_subtraction = tal1 - tal2;

        System.out.println("30 + 3 = " + summa_addition);
        System.out.println("30 - 3 = " +summa_subtraction);

        int produkt = tal1 * tal2;
        int kvot = tal1 / tal2;

        System.out.println("30 * 3 = " + produkt);
        System.out.println("30 / 3 = " + kvot);
   
        int rest1 = 10%3;
        int rest2 = 7%4;

        System.out.println("resten av 10/3 är " + rest1);
        System.out.println("resten av 7/4 är " + rest2);

        double decimal_tal1 = 5.0;
        double decimal_tal2 = 23.0;

        double dec_summa_addition = decimal_tal1 + decimal_tal2;
        double dec_summa_subtraktion = decimal_tal1 - decimal_tal2;

        System.out.println("5.0 + 23.0 = "+ dec_summa_addition);
        System.out.println("5.0 - 23.0 = "+dec_summa_subtraktion);


    }
}
