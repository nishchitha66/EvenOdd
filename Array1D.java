import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {
        
        int[] luckyNumbers = {7, 13, 21, 42};
        
        String[] fruits = new String[3]; 
        fruits[0] = "Apple";             
        fruits[1] = "Banana";            
        fruits[2] = "Orange";            

        
        System.out.println("First fruit: " + fruits[0]); 
        
        System.out.println("\nPrinting fruits using traditional for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }

        System.out.println("\nPrinting lucky numbers using for-each loop:");
        for (int number : luckyNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("\nQuick debug view of fruits array:");
        System.out.println(Arrays.toString(fruits));
    }
}
   