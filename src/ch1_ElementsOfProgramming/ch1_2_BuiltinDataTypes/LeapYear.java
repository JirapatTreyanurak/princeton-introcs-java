package ch1_ElementsOfProgramming.ch1_2_BuiltinDataTypes;

/**
 * Prints a sentence stating whether or not the given year is a leap year.
 * A year is a leap year if either [divisible by 400] or [divisible by 4 and not by 100].
 */
public class LeapYear {

    public static void main (String[] args) {
        boolean test = true;
        int year;
        boolean isLeapYear;
        if (test) {
            year = 1900;
        } else {
            if (args.length < 1) {
                System.err.println("Error: Must provide a year!");
                return;
            }
            year = Integer.parseInt(args[0]);
        }
        isLeapYear = ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
        System.out.print(year);
        if (isLeapYear) {
            System.out.println(" is a leap year.");
        } else {
            System.out.println(" is not a leap year.");
        }
    }

}
