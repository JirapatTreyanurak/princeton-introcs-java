package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

public class TernaryAnd {

    public static void main (String[] args) {
        if (args.length != 3) {
            System.err.println("Error: this program only takes exactly 3 arguments!");
            return;
        }
        if (args[0] == args[1] && args[1] == args[2]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
