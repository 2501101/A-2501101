import java.util.Scanner;

public class Compute {
    public static boolean leapYearBool(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else if (year % 400 == 0)
            return true;
        else
            return false;
    }

    public static int leapYearInt(int year) {
        if (year % 4 != 0)
            return 0;
        else if (year % 100 != 0)
            return 1;
        else if (year % 400 == 0)
            return 1;
        else
            return 0;
    }
}
