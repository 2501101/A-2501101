//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.print("원의 반지름을 입력하세요: ");
        int radius = keyboard.nextInt();


        int side = radius * 2;


        double squareArea = side * side;
        double circleArea = radius * radius * Math.PI;
        double area = squareArea - circleArea;


        System.out.printf("정사각형 면적: %d cm²%n", (int)squareArea);
        System.out.printf("원의 면적: %.2f cm²%n", circleArea);
        System.out.printf("구하는 면적: %.2f cm²%n", area);


    }
}