public class AddDigits {

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        int testNumber = 38;
        System.out.println("Single digit sum for " + testNumber + ": " + addDigits(testNumber)); 
    }
}