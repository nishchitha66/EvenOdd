import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        // Hardcoded sample values (or take user input)
        int a = 25;
        int b = 78;
        int c = 43;

        System.out.println("Numbers: " + a + ", " + b + ", " + c);

        // Approach 1: Using traditional if-else logic
        int largestIfElse = findLargestWithIf(a, b, c);
        System.out.println("Largest (Using If-Else): " + largestIfElse);

        // Approach 2: Using built-in Math.max() function
        int largestMath = findLargestWithMath(a, b, c);
        System.out.println("Largest (Using Math.max): " + largestMath);
    }

    // Traditional approach using logical AND (&&) operators
    public static int findLargestWithIf(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    // Modern / Compact approach chaining Math.max
    public static int findLargestWithMath(int num1, int num2, int num3) {
        // Math.max evaluates two numbers at a time
        return Math.max(num1, Math.max(num2, num3));
    }
}