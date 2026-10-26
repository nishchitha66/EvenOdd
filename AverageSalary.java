public class AverageSalary{
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        
        for (int s : salary) {
            sum += s;
            if (s < min) min = s;
            if (s > max) max = s;
        }
        
        // Subtract the extremes from the total sum
        sum = sum - min - max;
        
        // Divide by total count minus 2 elements
        return sum / (salary.length - 2);
    }
}