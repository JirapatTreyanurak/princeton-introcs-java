package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

public class Ordered {

    public static void main (String[] args) {
        boolean test = true;
        int x, y, z;
        if (test) {
            x = 8;
            y = 5;
            z = 2;
        } else {
            if (args.length == 3) {
                System.err.println("Error: Must provide exactly 3 arguments!");
                return;
            }
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = Integer.parseInt(args[2]);
        }
        if ((x <= y && y <= z)|| (x >= y && y >= z)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
