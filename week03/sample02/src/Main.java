import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        char ch;
        try {
            System.out.print("문자 입력: ");

            // System.in.read()는 한 바이트를 읽어 정수형으로 반환합니다.
            // 이를 char로 형변환하여 ch에 저장합니다.
            ch = (char) System.in.read();

            System.out.printf("입력 문자: %c이고, ASCII 코드: %h\n", ch, ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}