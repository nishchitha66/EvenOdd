public class OddNumbers {
    public static void main(String[] args) {
        // Iterate through all numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is not divisible by 2
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}