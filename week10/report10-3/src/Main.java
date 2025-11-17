import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] assign = new int[10];
        int[] attend = new int[10];
        int[] weighted = new int[10];

        for (int i = 0; i < 10; i++) {
            mid[i] = sc.nextInt();
            fin[i] = sc.nextInt();
            quiz[i] = sc.nextInt();
            assign[i] = sc.nextInt();
            attend[i] = sc.nextInt();

            weighted[i] = (mid[i] * 15 + fin[i] * 15 + quiz[i] * 10 + assign[i] * 40 + attend[i] * 20) / 100;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mid[i] + " " + fin[i] + " " + quiz[i] + " "
                    + assign[i] + " " + attend[i] + " " + weighted[i]);
        }
    }
}

