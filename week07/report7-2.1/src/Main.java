import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temp;
        String result;

        System.out.print("현재 온도(정수) 입력 : ");
        temp = keyboard.nextInt();

        if (temp >= 35) {
            result = "폭염 경보";
        } else if (temp >= 30) {
            result = "폭염 주의보";
        } else if (temp >= -10) {
            result = "정상 온도";
        } else {
            result = "한파 경보";
        }

        System.out.printf("현재 온도 %d도는 \"%s\" 입니다.\n", temp, result);
    }
}
