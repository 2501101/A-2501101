public class Main {
    public static void main(String[] args) {
        final int total = 37;
        final int leg = 102;
        int chicken = 1;
        int dog;

        while (chicken <= total) {
            dog = total - chicken;
            if (chicken * 2 + dog * 4 == leg) {
                System.out.printf("닭은 %d마리, 개는 %d마리입니다.\n", chicken, dog);
                break;
            }
            chicken++;
        }
    }
}
