package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints the sum of two dice throws.
 */
public class SumOfTwoDice {

    /**
     * Returns a random integer in the interval [1,6].
     *
     * @return A random integer in [1,6].
     */
    public static int throwDie () {
        return (int) (6*Math.random() + 1);
    }

    public static void main (String[] args) {
        System.out.println(throwDie() + throwDie());
    }

}
