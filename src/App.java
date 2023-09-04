public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 31;
        int tal2 = 3;

        int summa_addition = tal1 + tal2;
        int summa_subtraction = tal1 - tal2;

        System.out.println(summa_addition);
        System.out.println(summa_subtraction);

        int produkt = tal1 * tal2;
        int kvot = tal1 / tal2;

        System.out.println(produkt);
        System.out.println(kvot);
   
        int rest1 = 10%3;
        int rest2 = 7%4;

        System.out.println("resten av 10/3 är " + rest1);
        System.out.println("resten av 7/4 är " + rest2);

        
    }
}
