public class Main {
    public static void main(String[] args) {
        final int depth = 300;
        final int climb = 55;
        final int slide = 13;
        final int limit = 7;

        int height = 0;
        int day = 0;

        while (day < limit && height < depth) {
            day++;
            height += climb;
            if (height >= depth)
                break;
            height -= slide;
        }

        if (height >= depth)
            System.out.printf("달팽이는 %d일째 낮에 우물을 탈출했습니다.\n", day);
        else
            System.out.printf("달팽이는 %d일 동안 %dcm 올라갔지만 탈출하지 못했습니다.\n", day, height);
    }
}



