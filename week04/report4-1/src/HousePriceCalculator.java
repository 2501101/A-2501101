import java.util.Scanner;

public class HousePriceCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int PRICE_PER_PYEONG = 56000;
        int area;

        long totalPrice;
        long finalPrice;

        System.out.print("주택 면적(평)을 입력하세요: ");
        area = keyboard.nextInt();

        totalPrice = (long)area * PRICE_PER_PYEONG;

        finalPrice = (totalPrice / 1000) * 1000;

        System.out.printf("\n--- 주택 가격 계산 결과 ---\n");
        System.out.printf("면적: %d평\n", area);
        System.out.printf("1평 단가: %,d원\n", PRICE_PER_PYEONG);
        System.out.printf("총 가격 (1,000원 미만 버림): %,d원\n", finalPrice);

        keyboard.close();
    }
}