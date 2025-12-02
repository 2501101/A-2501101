import java.util.Scanner;

public class Input {
    public static int readData(String s) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(s);
        int temp = keyboard.nextInt();
        return temp;
    }
}
