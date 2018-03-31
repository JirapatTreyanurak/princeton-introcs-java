package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints the given 3 integers in ascending order.
 */
public class ThreeSort {

    public static void main (String[] args) {
        boolean test = true;
        int a, b, c;
        if (test) {
            a = 8;
            b = 2;
            c = 5;
        } else {
            if (args.length < 3) {
                System.err.println("Error: Must provide 3 integers!");
                return;
            }
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        int min = Math.min(a, b);
        min = Math.min(min, c);
        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println(String.format(
            "Input:\t{%1$d,%2$d,%3$d}\nOutput:\t{%4$d,%5$d,%6$d}",
            a, b, c,
            min, (a+b+c)-max-min, max
        ));
    }

}
