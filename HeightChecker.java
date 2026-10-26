import java.util.Arrays;

public class HeightChecker{
    public int heightChecker(int[] heights) {
        // Clone the array to sort it as the expected target
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        int mismatchCount = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }
        return mismatchCount;
    }
}