public class Main {
    public static void main(String[] args) {
        final int won500 = 500;
        final int won100 = 100;
        final int count = 10;
        final int MONTH = 12;
        final int year = 30;

        int month = (won500 * count) + (won100 * count);
        int amount = month * MONTH * year;

        System.out.printf("30년 동안의 총 저금액은 %,d원입니다.\n", amount);
    }
}
