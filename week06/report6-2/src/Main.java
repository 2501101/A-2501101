import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final float VAT_RATE = 0.10f;
        final float DISCOUNT_THRESHOLD = 50000.0f;
        final float DISCOUNT_RATE = 0.07f;

        float liters;
        float priceperLiter;
        float originalTotal;
        float discountAmount;
        float discountedTotal;
        float finalTotal;

        System.out.print("주유할 리터 수(L)를 입력하세요: ");
        liters = keyboard.nextFloat();
        System.out.print("리터당 가격(원)을 입력하세요: ");
        priceperLiter = keyboard.nextFloat();

        originalTotal = liters * priceperLiter;

        float currentDiscountRate = (originalTotal >= DISCOUNT_THRESHOLD) ? DISCOUNT_RATE : 0.0f;
        discountAmount = originalTotal * currentDiscountRate;
        discountedTotal = originalTotal - discountAmount;

        float vatAmount = discountedTotal * VAT_RATE;
        finalTotal = discountedTotal + vatAmount;

        System.out.printf("\n--- 주유 금액 계산 결과 ---\n");
        System.out.printf("주유 금액 (할인 전): %,.0f 원\n", originalTotal);
        System.out.printf("할인율 적용: %.0f %%\n", currentDiscountRate * 100);
        System.out.printf("할인 금액: %,.0f 원\n", discountAmount);
        System.out.printf("부가세 (10%%): %,.0f 원\n", vatAmount);
        System.out.printf("최종 지불 금액: %,.0f 원\n", finalTotal);

        keyboard.close();
    }
}