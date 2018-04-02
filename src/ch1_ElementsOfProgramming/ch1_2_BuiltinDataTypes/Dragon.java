package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints the dragon curve of the given order.
 */
public class Dragon {

    /**
     * Returns a string representing the dragon curve of order n.
     *
     * @param n
     * @return String representation of the dragon curve of order n.
     */
    public static String dragonCurve (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: n must be non-negative!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("F");
        for (int order = 1; order <= n; order++) {
            StringBuilder prev = new StringBuilder(sb.toString());
            sb.append("L");
            for (int i = prev.length() - 1; i >= 0; i--) {
                char c = prev.charAt(i);
                if (c == 'L') {
                    c = 'R';
                } else if (c == 'R') {
                    c = 'L';
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main (String[] args) {
        boolean test = true;
        int n;
        if (test) {
            n = 3;
        } else {
            if (args.length < 1) {
                System.err.println("Error: Must provide the order for the dragon curve!");
                return;
            }
            n = Integer.parseInt(args[0]);
        }
        System.out.println(String.format(
            "Dragon curve of order %1$d:\n\t%2$s",
            n,
            dragonCurve(n)
        ));
    }

}
