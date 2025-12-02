import java.util.Scanner;

public class Input {
    public static long readMoney(String s) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(s);
        long money = keyboard.nextLong();
        return money;
    }
}
