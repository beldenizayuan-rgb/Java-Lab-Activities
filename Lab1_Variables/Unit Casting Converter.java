public class Main {
    public static void main(String[] args) {
        double cm = 457.9;
        int meters = (int) (cm / 100);
        double leftover = cm - meters * 100;

        System.out.println(cm + " cm is " + meters + " meters and " + Math.round(leftover * 10) / 10.0 + " cm");

        int num = 42;
        // int can change to double automatically
        double numDouble = num;
        System.out.println("int to double: " + numDouble);

        double price = 99.99;
        // Decimal part will be removed
        int priceInt = (int) price;
        System.out.println("double to int: " + priceInt);
    }
}
