import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char ch;
        String result;

        System.out.print("하나의 영 문자를 입력하세요: ");
        ch = keyboard.next().charAt(0);

        boolean isAlphabet = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');

        result = isAlphabet
                ? String.format("입력 문자 %c는 %s이고, %s로 변경하면 %c 입니다.",
                ch,
                (ch >= 'a' && ch <= 'z') ? "소문자" : "대문자",
                (ch >= 'a' && ch <= 'z') ? "대문자" : "소문자",
                (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : (char)(ch + 32))
                : "영문자가 아닙니다.";

        System.out.println(result);
    }
}
