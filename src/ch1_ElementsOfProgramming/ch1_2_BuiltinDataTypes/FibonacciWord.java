package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints the fibonacci word of order 0 through 10.
 */
public class FibonacciWord {

    /**
     * Returns the fibonacci word of order n, f(n), where:
     *   f(0) = "a"
     *   f(1) = "b"
     *   f(n) = concat(f(n-1), f(n-2)
     *
     * Throws IllegalArgumentException for negative n.
     *
     * @param n order of the fibonacci word.
     * @return Fibonacci word of order n.
     */
    public static String fibonacciWord (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: Order must be non-negative!");
        }
        String base0 = "a";
        String base1 = "b";
        if (n == 0) {
            return base0;
        }
        if (n == 1) {
            return base1;
        }
        StringBuilder fibWord = new StringBuilder("b");
        for (int i = 2; i <= n; i++) {
            fibWord.append(base0);
            base0 = base1;
            base1 = fibWord.toString();
        }
        return fibWord.toString();
    }

    public static void main (String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format(
                "f(%1$d)\t= %2$s",
                i,
                fibonacciWord(i)
            ));
        }
    }

}
