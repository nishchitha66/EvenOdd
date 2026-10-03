import java.util.ArrayList;
import java.util.List;

public class CommonFactors {
    public static List<Integer> findCommonFactors(int a, int b) {
        List<Integer> factors = new ArrayList<>();
        
        int limit = Math.min(Math.abs(a), Math.abs(b));
        
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                factors.add(i);
            }
        }
        
        return factors;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        List<Integer> commonFactors = findCommonFactors(num1, num2);

        System.out.println("Common factors of " + num1 + " and " + num2 + " are: " + commonFactors);
    }
}