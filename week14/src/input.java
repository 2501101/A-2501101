public class input {
    public static int[][] inputScore(String[][] students) {
        int[][] score = new int[students.length][5];
        int v;

        String[] subject = {"국어", "영어", "수학", "선택"};

        for (int i = 0; i < students.length; i++) {
            System.out.println("*** 학생 " + students[i][1] + " 성적 입력 ***");
            for (int k = 0; k < 4; k++) {
                if (k == 3) {
                    if (students[i][2].equals("남")) subject[3] = "기술";
                    else subject[3] = "가정";
                }

                v = -1;
                while (v < 0 || v > 100) {
                    System.out.print(students[i][1] + "의 " + subject[k] + " 점수 입력 : ");
                    v = Program.nextInt(); // 배운 코드에서 사용한 입력 메소드
                    if (v < 0 || v > 100)
                        System.out.println("ERROR : 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
                }

                score[i][k] = v;
            }
        }
        return score;
    }
}



