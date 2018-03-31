package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Samples n random numbers in the interval [0,1], then prints their
 * average, min, and max values.
 */
public class StatsN {

    public static void main (String[] args) {
        int n = 5;
        double[] sample = new double[n];
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        System.out.print("Sample:\n\t{");
        for (int i = 0; i < n; i++) {
            sample[i] = Math.random();
            sum += sample[i];
            min = Math.min(min, sample[i]);
            max = Math.max(max, sample[i]);
            System.out.print(sample[i]);
            if (i < n-1) {
                System.out.print(",");
            } else {
                System.out.println("}");
            }
        }
        double average = sum / n;
        System.out.println("Average:\t" + average);
        System.out.println("Min:\t\t" + min);
        System.out.println("Max:\t\t" + max);
    }

}
