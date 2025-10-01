import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double celsius;

        System.out.print("섭씨 온도를 입력하세요: ");
        celsius = keyboard.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.printf("입력한 섭씨 온도: %.2f°C\n", celsius);
        System.out.printf("변환된 화씨 온도: %.2f°F\n", fahrenheit);

        keyboard.close();
    }
}