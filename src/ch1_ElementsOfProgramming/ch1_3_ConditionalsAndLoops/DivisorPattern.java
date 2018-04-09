package ch1_ElementsOfProgramming.ch1_3_ConditionalsAndLoops;

/**
 * Takes one integer argument n and prints a table where each entry (i,j)
 * is an asterisk if i divides j or j divides i.
 */
public class DivisorPattern {

    public static void main (String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Must provide exactly 1 integer!");
            return;
        }
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Must provide an integer!");
            return;
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row % col == 0 || col % row == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" " + row);
        }
    }

}
