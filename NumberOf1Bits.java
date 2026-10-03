public class NumberOf1Bits {

    public static int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
            count++;
            n &= (n - 1); 
        }
        
        return count;
    }

    public static void main(String[] args) {
        int testNumber = 11;
        System.out.println("Number of 1 bits in " + testNumber + ": " + hammingWeight(testNumber)); 
    }
}