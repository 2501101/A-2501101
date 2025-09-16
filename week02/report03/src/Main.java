//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        Scanner keyboard = new Scanner(System.in);
        String name="";
        int familyCoun = 0;
        String address= "";

        System.out.print("당신의 이름은?");
        name = keyboard.nextLine();
        System.out.printf("%s님의 가족은 몇 명입니까? ?",name);
        familyCoun = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 주소는?",name);
        address = keyboard.nextLine();;

        System.out.printf("\n%s님의 나이는 %d명 입니다.\n", name, familyCoun);
        System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n",name,address);

    }
}