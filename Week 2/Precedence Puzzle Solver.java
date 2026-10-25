public class ExpressionOrder {
    public static void main(String[] args) {
        int x = 4;
        int y = 10;
        // Prediction: true
        boolean ans1 = x + y * 2 > 20;
        System.out.println("Answer 1: " + ans1);
        // Prediction: true
        boolean ans2 = x > 5 || y < 20 && x == 4;
        System.out.println("Answer 2: " + ans2);
        // Prediction: 15
        int ans3 = x++ * 2 + y % 3;
        System.out.println("Answer 3: " + ans3);
        // Prediction: 5
        int ans4 = --y - x / 2;
        System.out.println("Answer 4: " + ans4);
    }
}
