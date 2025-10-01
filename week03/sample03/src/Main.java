import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final String NAME = "양준혁";
        int batting = 0;
        int hit = 0;
        // int result = 0.0f; // 오류 발생 코드

        // 1. result 변수의 데이터 타입을 float로 변경
        float result = 0.0f;

        System.out.printf("오늘의 타수 입력 : ");
        batting = keyboard.nextInt();
        System.out.printf("오늘의 안타수 입력 : ");
        hit = keyboard.nextInt();

        // 2. 타율을 계산하여 float 변수에 저장
        result = (float)hit / batting;

        System.out.printf("선수 이름 : %s\n", NAME);
        System.out.printf("오늘의 타수 : %d\n", batting); // '%ds' -> '%d'로 수정
        System.out.printf("오늘의 안타수 : %d\n", hit); // '%ds' -> '%d'로 수정
        System.out.printf("오늘의 타율 : %.2f\n", result);
    }
}