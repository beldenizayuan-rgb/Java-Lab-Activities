public class Main {
    public static void main(String[] args) {
        String storeName = "Alfamart";
        int quantity = 4;
        double unitPrice = 49.75;

        double totalCost = quantity * unitPrice;

        System.out.println("Store: " + storeName);
        System.out.println("Qty: " + quantity);
        System.out.println("Price each: " + unitPrice);
        System.out.println("Total: " + totalCost);
    
       // I used double because the total price have decimals. 
    }
    
}
