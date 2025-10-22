import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        int max, mid, min;

        System.out.print("3개의 정수 입력 (예: 3 5 8) : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if ((a == b && b == c)) {
            System.err.println("ERROR : 세 수가 모두 같으면 순서를 정할 수 없습니다.");
        } else {
            max = a;
            min = a;

            if (b > max) max = b;
            if (c > max) max = c;

            if (b < min) min = b;
            if (c < min) min = c;

            mid = a + b + c - max - min;

            System.out.printf("입력한 %d, %d, %d를 크기순으로 나열하면 → %d, %d, %d 입니다.\n",
                    a, b, c, min, mid, max);
        }
    }
}
