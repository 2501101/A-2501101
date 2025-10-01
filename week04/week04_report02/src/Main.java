import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double totalAmount;

        System.out.print("총 판매 금액을 입력하세요 (원): ");
        totalAmount = keyboard.nextDouble();

        int supplyAmount = (int) (totalAmount / 1.1);

        int taxAmount = (int) (totalAmount - supplyAmount);

        System.out.printf("\n--- 계산 결과 ---\n");
        System.out.printf("총 판매 금액: %,d원\n", (int)totalAmount);
        System.out.printf("금액 (공급가액): %,d원\n", supplyAmount);
        System.out.printf("부가가치세 (10%%): %,d원\n", taxAmount);

        keyboard.close();
    }
}