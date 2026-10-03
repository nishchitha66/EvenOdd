public class NumberOfStepsToZero {
    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2; 
            } else {
                num -= 1; 
            }
            steps++; 
        }

        return steps;
    }

    public static void main(String[] args) {
        int testNumber = 14;
        System.out.println("Steps to reduce " + testNumber + " to zero: " + numberOfSteps(testNumber)); 
    }
}