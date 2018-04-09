package ch1_ElementsOfProgramming.ch1_3_ConditionalsAndLoops;

/**
 * Takes one integer argument n and prints all of the powers of twos
 * less than or equal to n.
 */
public class PowersOfTwo {

    public static void main (String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Must provide exactly one integer!");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int powers = 1;
        System.out.println(String.format(
            "Powers of 2s less than or equal to %1$d:",
            n
        ));
        for (int i = 0; powers <= n; i++) {
            System.out.println(String.format(
                "\t2^%1$d\t= %2$d",
                i,
                powers
            ));
            powers*= 2;
        }
    }

}
