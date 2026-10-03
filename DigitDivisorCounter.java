public class DigitDivisorCounter {
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10; 
            if (digit != 0 && num % digit == 0) {
                count++;
            }

            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int number1 = 1248;
        int number2 = 121;

        System.out.println("Digits in " + number1 + " that divide it: " + countDigits(number1)); 

        System.out.println("Digits in " + number2 + " that divide it: " + countDigits(number2)); 
    }
}