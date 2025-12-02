import java.util.Scanner;

public class Compute {
    private static String[] numKor = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    private static String[] unitKor = {"", "십", "백", "천"};
    private static String[] sectionKor = {"", "만", "억", "조"};

    public static String convertHangul(long money) {
        if (money == 0)
            return "영";

        String result = "";
        String strMoney = String.valueOf(money);
        int length = strMoney.length();
        int sectionCount = 0;

        while (length > 0) {
            int start = Math.max(length - 4, 0);
            String section = strMoney.substring(start, length);
            String sectionStr = convertSection(section);
            if (!sectionStr.equals("")) {
                result = sectionStr + sectionKor[sectionCount] + result;
            }
            sectionCount++;
            length = start;
        }

        return result;
    }

    private static String convertSection(String section) {
        StringBuilder sb = new StringBuilder();
        int len = section.length();

        for (int i = 0; i < len; i++) {
            int digit = section.charAt(i) - '0';
            if (digit != 0) {
                sb.append(numKor[digit]);
                sb.append(unitKor[len - i - 1]);
            }
        }
        return sb.toString();
    }
}
