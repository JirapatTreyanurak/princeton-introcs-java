package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints the Euclidean distance from the origin to the given point.
 */
public class Distance {

    /**
     * Returns the Euclidean distance between the points (x1,y1) and (x2,y2).
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return Euclidean distance between (x1,y1) and (x2,y2).
     */
    public static double euclidean (int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main (String[] args) {
        boolean test = true;
        int x, y;
        if (test) {
            x = 3;
            y = 4;
        } else {
            if (args.length < 2) {
                System.err.println("Error: Must provide the 2 coordinates of a point!");
                return;
            }
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        }
        System.out.print(String.format(
            "Distance from the origin to (%1$d,%2$d) is %3$f",
            x, y,
            euclidean(0,0,x,y)
        ));
    }

}
