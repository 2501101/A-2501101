import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int baseFee = 10000;
        float teenRate = 0.30f;
        float seniorRate = 0.40f;
        float morningRate = 0.20f;
        int teenmin = 8;
        int teenmax = 18;
        int seniormin = 65;

        int age, time;
        float discount = 0.0f;
        float finalfee;

        System.out.print("사용자 연령을 입력하세요: ");
        age = keyboard.nextInt();
        System.out.print("관람 시간 (0~23시)을 입력하세요: ");
        time = keyboard.nextInt();

        if (age >= seniormin) {
            discount = seniorRate;
        } else if (age >= teenmin && age <= teenmax) {
            discount = teenRate;
        } else {
            discount = 0.0f;
        }

        if (time >= 5 && time <= 11) {
            if (morningRate > discount) {
                discount = morningRate;
            }
        }

        finalfee = baseFee * (1 - discount);

        System.out.println("\n--- 영화 관람 요금 계산 결과 ---");
        System.out.printf("기본 요금: %,d원\n", baseFee);
        System.out.printf("적용 할인율: %.0f%%\n", discount * 100);
        System.out.printf("할인 금액: %,.0f원\n", baseFee * discount);
        System.out.printf("최종 지불 요금: %,.0f원\n", finalfee);

        keyboard.close();
    }
}

