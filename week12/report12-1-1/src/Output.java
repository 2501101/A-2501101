public class Output {
    public static void display(int a, int b, int c, int d, int max) {
        display();
        System.out.printf("%d, %d, %d, %d 중 가장 큰 수는 %d입니다.\n", a, b, c, d, max);
        display();
    }

    private static void display() {
        System.out.println("*****************************");
    }
}
