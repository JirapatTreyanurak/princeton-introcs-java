package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

public class Dragon {

    /**
     *
     *
     * @param n
     * @return
     */
    public static String dragonCurve (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: n must be non-negative!");
        }
        StringBuilder previous = new StringBuilder("F");
        StringBuilder current = new StringBuilder();
        if (n == 0) {
            current = previous;
        } else {
            for (int i = 0; i < n; i++) {
                StringBuilder temp = new StringBuilder(previous.toString());
                StringBuilder nextHalf = new StringBuilder(temp.reverse().toString());
                for (int c = 0; c < nextHalf.length(); c++) {
                    if (nextHalf.charAt(c) == 'R') {
                        nextHalf.replace(c, c+1, "L");
                    }
                    if (nextHalf.charAt(c) == 'L') {
                        nextHalf.replace(c, c+1, "R");
                    }
                }
                current = new StringBuilder(previous.toString());
                current.append("L").append(nextHalf);
                previous = new StringBuilder(current.toString());
            }
        }
        return current.toString();
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
