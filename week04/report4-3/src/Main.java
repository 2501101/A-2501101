import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int dollar, half, quarter, dime, nickel, penny;
        int totalCent;

        System.out.print("달러(Dollar) 개수 (100센트): ");
        dollar = keyboard.nextInt();
        System.out.print("하프(Half) 개수 (50센트): ");
        half = keyboard.nextInt();
        System.out.print("쿼터(Quarter) 개수 (25센트): ");
        quarter = keyboard.nextInt();
        System.out.print("다임(Dime) 개수 (10센트): ");
        dime = keyboard.nextInt();
        System.out.print("니켈(Nickel) 개수 (5센트): ");
        nickel = keyboard.nextInt();
        System.out.print("페니(Penny) 개수 (1센트): ");
        penny = keyboard.nextInt();

        totalCent = (dollar * 100) +
                (half * 50) +
                (quarter * 25) +
                (dime * 10) +
                (nickel * 5) +
                (penny * 1);

        System.out.printf("\n총 금액은 %d 센트 입니다.\n", totalCent);
        System.out.printf("달러로 환산하면 $%.2f 입니다.\n", (double)totalCent / 100);

        keyboard.close();
    }
}