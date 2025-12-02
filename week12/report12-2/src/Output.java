public class Output {
    public static void display(int year, int studentID, boolean leap) {
        display();
        System.out.printf("학번 %d 학생이 입력한 연도 %d년은 ", studentID, year);
        if (leap)
            System.out.println("윤년입니다.");
        else
            System.out.println("평년입니다.");
        display();
    }

    public static void display(int year, int studentID, int leap) {
        display();
        System.out.printf("학번 %d 학생이 입력한 연도 %d년은 ", studentID, year);
        if (leap == 1)
            System.out.println("윤년입니다.");
        else
            System.out.println("평년입니다.");
        display();
    }

    private static void display() {
        System.out.println("*****************************");
    }
}
