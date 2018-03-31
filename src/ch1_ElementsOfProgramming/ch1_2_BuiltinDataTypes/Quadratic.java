package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

public class Quadratic {

    public static void main (String[] args) {
        boolean test = true;
        double a, b, c;
        if (test) {
            a = 1;
            b = 0;
            c = -1;
        } else {
            if (args.length < 3) {
                System.err.println("Error: Must provide 3 coefficients!");
                return;
            }
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        }
        String formula = String.format("%1$f*x^2 + %2$f*x + %3$f", a, b ,c);
        System.out.println(formula);
        double radicand = (b*b) - (4*a*c);
        if (radicand < 0) {
            System.out.println("There are no real roots.");
        } else if (radicand == 0) {
            double root = -b / (2*a);
            System.out.println(String.format("Root:\n\t%1$f", root));
        } else {
            double root1 = (-b + Math.sqrt(radicand)) / (2*a);
            double root2 = (-b - Math.sqrt(radicand)) / (2*a);
            System.out.println(String.format("Roots:\n\t%1$f\n\t%2$f", root1, root2));
        }
    }

}
