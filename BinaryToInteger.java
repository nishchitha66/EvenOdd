public class BinaryToInteger {

    public static int convertUsingBuiltIn(String binaryStr) {
        return Integer.parseInt(binaryStr, 2); 
    }

    public static int convertManually(String binaryStr) {
        int result = 0;
        
        for (int i = 0; i < binaryStr.length(); i++) {
            char c = binaryStr.charAt(i);
            result = result * 2 + (c - '0');
        }
        
        return result;
    }

    public static void main(String[] args) {
        String binaryNumber = "1101"; 

        System.out.println("Using Integer.parseInt: " + convertUsingBuiltIn(binaryNumber)); 
        

        System.out.println("Using manual calculation: " + convertManually(binaryNumber)); 
        
    }
}