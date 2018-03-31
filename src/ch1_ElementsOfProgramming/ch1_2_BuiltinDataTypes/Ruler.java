package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints the relative lengths of the subdivisions on a ruler of specified length.
 */
public class Ruler {

    public static void main (String[] args) {
        boolean test = true;
        int length;
        if (test) {
            length = 5;
        } else {
            length = Integer.parseInt(args[0]);
        }
        StringBuilder wing = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        if (length > 0) {
            wing.append("1");
            sb = wing;
            if (length > 1) {
                for (int i = 2; i <= length; i++) {
                    sb = new StringBuilder();
                    sb.append(wing).append(i).append(wing);
                    wing = sb;
                }
            }
        }
        System.out.println(sb.toString());
    }

}
