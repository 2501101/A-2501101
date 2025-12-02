public class Output {
    public static void display(int first, int second, int max) {
        display();
        System.out.printf("%d와 %d 중 큰 수는 %d입니다.\n", first, second, max);
        display();
    }

    private static void display() {
        System.out.println("*****************************");
    }
}
