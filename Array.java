public class Array{
    public static void main(String[] args) {
        // 1. Array initialized with values
        int[] primeNumbers = {2, 3, 5, 7, 11};
        int sizeOfPrimes = primeNumbers.length;
        System.out.println("Size of primeNumbers array: " + sizeOfPrimes); 
        // Outputs: 5

        // 2. Array initialized with a fixed capacity
        String[] usernames = new String[10];
        System.out.println("Size of usernames array: " + usernames.length); 
        // Outputs: 10 (Even if it is empty, it returns the allocated capacity)

        // 3. Multi-dimensional array (2D Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Number of rows: " + matrix.length);       // Outputs: 2
        System.out.println("Number of columns: " + matrix[0].length); // Outputs: 3
    }
}