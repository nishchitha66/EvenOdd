public class BinaryNumberOperation {

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal); 
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String manualDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int number = 42;
        String binaryStr = "101010";

        System.out.println("Decimal " + number + " in binary: " + decimalToBinary(number)); 

        System.out.println("Binary " + binaryStr + " in decimal: " + binaryToDecimal(binaryStr)); 

        System.out.println("Manual conversion of 42: " + manualDecimalToBinary(42));
    }
}