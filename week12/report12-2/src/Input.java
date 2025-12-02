import java.util.Scanner;

public class Input {
    public static int readYear(String s) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(s);
        int year = keyboard.nextInt();
        return year;
    }

    public static int readStudentID(String s) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(s);
        int id = keyboard.nextInt();
        return id;
    }
}
