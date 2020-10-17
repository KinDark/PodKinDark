package app;

public class SimpleCalculator {

    public static void main(String[] args) {

        sum(args);
        product(args);
    //TODO
    }

    public static int product(String[] args) {
        int product=1;
        if (args[0].equals("*")) {
         for (int i = 1; i < args.length; i++) {
             product *= Integer.parseInt(args[i]);
         }
         System.out.println("wynik mnożenia: " + product);
     }
        return product;
    }

    public static int sum(String[] args) {
        int sum =0 ;
        if (args[0].equals("+")) {
            for (int i = 1; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("suma liczb: " + sum);
            //return sum;
        }
        return sum;
    }
}
