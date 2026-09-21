import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Store the original number in a temporary variable
        int originalNum = num;
        int reversedNum = 0;
        
        // Logic to reverse the number
        while (num > 0) {
            int remainder = num % 10; // Extract the last digit
            reversedNum = (reversedNum * 10) + remainder; // Append it to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }
        
        // Check if the original number and reversed number are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
        
        scanner.close();
    }
}