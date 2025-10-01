import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;    // 키(m 단위)
        char gender;     // 성별
        float standard;  // 표준 체중
        float beautiful; // 미용 체중 (여자만 해당)

        System.out.print("당신의 성별(남 = M, 여 = F) 입력 : ");
        gender = keyboard.next().charAt(0);

        System.out.print("당신의 키(단위 : Meter) 입력 : ");
        height = keyboard.nextFloat();

        // 성별에 따른 표준체중 계산
        if (gender == 'M' || gender == 'm') {
            standard = height * height * 22;
            System.out.printf("키가 %.2f Meter인 남자의 표준 체중은 %.2f Kg 입니다.\n",
                    height, standard);
        } else if (gender == 'F' || gender == 'f') {
            standard = height * height * 21;
            beautiful = height * height * 20;
            System.out.printf("키가 %.2f Meter인 여자의 표준 체중은 %.2f Kg 입니다.\n",
                    height, standard);
            System.out.printf("키가 %.2f Meter인 여자의 미용 체중은 %.2f Kg 입니다.\n",
                    height, beautiful);
        } else {
            System.out.println("성별 입력이 잘못되었습니다. (M/F 중 입력하세요)");
        }
    }
}
