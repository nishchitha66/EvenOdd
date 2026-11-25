import java.util.Arrays;
import java.util.Random;

public class ArrayShuffler {

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        shuffleArray(numbers);
        
        System.out.println("Shuffled Array: " + Arrays.toString(numbers));
    }
}
