import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int total;
        boolean member;
        boolean free;

        System.out.print("총 구매 금액을 입력하세요 (원): ");
        total = keyboard.nextInt();
        System.out.print("멤버십 회원입니까? (true/false): ");
        member = keyboard.nextBoolean();

        free = (total >= 50000) ||
                (member && total >= 30000);

        String result = free ? "무료배송 대상입니다." : "배송비가 부과됩니다.";

        System.out.printf("\n총 구매 금액: %,d원\n", total);
        System.out.printf("멤버십 여부: %s\n", member);
        System.out.println("결과: " + result);

    }
}