import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        String grade;

        System.out.print("당신의 JAVA 성적을 입력하세요 (0~100): ");
        score = keyboard.nextInt();

        grade = (score == 100) ? "A+" :
                (score >= 95) ? "A+" :
                (score >= 90) ? "A0" :
                (score >= 85) ? "B+" :
                (score >= 80) ? "B0" :
                (score >= 75) ? "C+" :
                (score >= 70) ? "C0" :
                (score >= 65) ? "D+" :
                (score >= 60) ? "D0" :
                (score >= 60) ? "D0" : "F"
        ;

        System.out.printf("\n입력 점수: %d\n", score);
        System.out.printf("학점: %s\n", grade);

    }
}