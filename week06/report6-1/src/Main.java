import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int price = 3500;
        int count;
        float rate;
        float discountedPrice;
        float finalPrice;

        System.out.print("구매할 식권의 개수를 입력하세요: ");
        count = keyboard.nextInt();

        // 1. 할인율 결정 (조건 연산자 중첩 사용)
        rate = (count >= 30) ? 0.20f :
                (count >= 20) ? 0.15f :
                        (count >= 10) ? 0.10f :
                                0.00f;

        // 2. 할인 금액 계산 및 최종 금액 계산
        discountedPrice = (float)count * price * rate;
        finalPrice = (float)count * price - discountedPrice;

        System.out.printf("\n--- 식권 구매 결과 ---\n");
        System.out.printf("구매 개수: %d 장\n", count);
        System.out.printf("식권 단가: %,d 원\n", price);
        System.out.printf("할인율: %.0f %%\n", rate * 100);
        System.out.printf("할인 금액: %,.0f 원\n", discountedPrice);
        System.out.printf("최종 금액: %,.0f 원\n", finalPrice);

        keyboard.close();
    }
}