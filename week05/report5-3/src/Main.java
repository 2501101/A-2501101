import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int sec_per_hour = 3600;
        final int sec_per_minute = 60;

        int total;
        int hours;
        int minutes;
        int seconds;

        System.out.print("총 초(Seconds)를 입력하세요: ");
        total = keyboard.nextInt();

        int result = total;

        hours = result / sec_per_hour;
        result %= sec_per_hour;

        minutes = result / sec_per_minute;
        seconds = result % sec_per_minute;

        System.out.printf("\n%d 초는 %d 시간 %d 분 %d 초 입니다.\n",
                total, hours, minutes, seconds);

    }
}