package ch1_ElementsOfProgramming.ch1_1_HelloWorld;

/**
 * Prints a "Hi x." where x is the list of names from the argument
 * in reverse order.
 */
public class UseThree {

    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hi");
        if (args.length > 0) {
            sb.append(" ");
            if (args.length == 1) {
                sb.append(args[0]);
            } else if (args.length == 2) {
                sb.append(args[1]).append(" and ").append(args[0]);
            } else {
                for (int i = args.length-1; i >= 0; i--) {
                    sb.append(args[i]);
                    if (i >= 1) {
                        sb.append(", ");
                    }
                    if (i == 1) {
                        sb.append("and ");
                    }
                }
            }
        }
        sb.append(".");
        System.out.println(sb.toString());
    }

}
