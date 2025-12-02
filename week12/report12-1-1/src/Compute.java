import java.util.Scanner;

public class Compute {
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int max4(int a, int b, int c, int d) {
        int temp1 = max(a, b);
        int temp2 = max(c, d);
        return max(temp1, temp2);
    }
}
