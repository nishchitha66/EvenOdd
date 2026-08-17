public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0; // Tracks total sum

        // Loop numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            sum += i; // Adds current number to total
        }

        // Print final result
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}