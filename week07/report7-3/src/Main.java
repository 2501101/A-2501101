import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int kor, eng, math, total;
        double avg;
        char grade;
        String result;

        System.out.print("국어, 영어, 수학 점수 입력 : ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        total = kor + eng + math;
        avg = (double) total / 3;

        grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F';
        result = (avg >= 80) ? "성적양호" : (avg >= 60) ? "노력" : "성적불량";

        System.out.println("==========================================");
        System.out.printf("국어   영어   수학   평균   학점   결과\n");
        System.out.printf("%d     %d     %d     %.2f   %c      %s\n", kor, eng, math, avg, grade, result);
        System.out.println("==========================================");

        keyboard.close();
    }
}
