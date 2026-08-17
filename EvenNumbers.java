public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // % operator checks if the number is divisible by 2
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}