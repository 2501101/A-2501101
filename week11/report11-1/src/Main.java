import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] num = new String[10];
        String[] name = new String[10];
        int[] division = new int[10];
        float[] use1 = new float[10];
        int[] use2 = new int[10];
        int[] money = new int[10];
        int[] tax = new int[10];
        int[] pay = new int[10];

        int i = 0;
        while (i < 10) {
            num[i] = keyboard.next();
            name[i] = keyboard.next();
            division[i] = keyboard.nextInt();
            use1[i] = keyboard.nextFloat();

            if (division[i] >= 1 && division[i] <= 5 && use1[i] >= 0) {
                int temp = (int)(use1[i] * 10.0f + 0.5f);
                use2[i] = temp / 10;

                if (division[i] == 1) money[i] = use2[i] * 40;
                else if (division[i] == 2) money[i] = use2[i] * 55;
                else if (division[i] == 3) money[i] = use2[i] * 65;
                else if (division[i] == 4) money[i] = use2[i] * 70;
                else money[i] = use2[i] * 80;

                int temp2 = (1200 + money[i]) * 5;
                tax[i] = temp2 / 100;
                tax[i] = (tax[i] / 10) * 10;

                pay[i] = 1200 + money[i] + tax[i];

                i++;
            }
        }

        System.out.println("수도요금");
        System.out.println("--------------------------------------------------------------");
        System.out.println("번호   이름   구분   사용량   사용금액   TAX   납부액   비고");
        System.out.println("--------------------------------------------------------------");

        for (i = 0; i < 10; i++) {
            System.out.printf("%-6s %-6s %-4d %-8.1f %-10d %-6d %-8d\n",

                    num[i], name[i], division[i], use2[i]*1.0f, money[i], tax[i], pay[i]);
        }
    }
}
