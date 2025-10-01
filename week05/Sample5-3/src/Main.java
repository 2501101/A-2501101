public class Main {
    public static void main(String[] args) {

        int a = 5;
        boolean test = (5 > 4) && a++ !=0;
        System.out.printf("test = %b, a = %d\n", test, a);

        test = (5 < 4) && a++ != 0;
        System.out.printf("test = %b, a = %d\n", test, a);

        test = (5 < 4) || a++ != 0;
        System.out.printf("test = %b, a = %d\n", test, a);

        test = (5 > 4) || a++ != 0;
        System.out.printf("test = %b, a = %d\n", test, a);




        a = 5;
        test = (5 > 4) & a++ !=5;
        System.out.printf("test = %b, a = %d\n", test, a);

        test = (5 < 4) & a++ != 5;
        System.out.printf("test = %b, a = %d\n", test, a);

        test = (5 < 4) | a++ != 5;
        System.out.printf("test = %b, a = %d\n", test, a);

        test = (5 > 4) | a++ != 5;
        System.out.printf("test = %b, a = %d\n", test, a);

    }
}
