public class Output {
    public static void display(long money, String result) {
        display();
        System.out.println("입력금액: " + money);
        System.out.println("한글 변환: " + result);
        display();
    }

    private static void display() {
        System.out.println("*****************************");
    }
}
