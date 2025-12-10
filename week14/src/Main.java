public class Main {
    public static void main(String[] args){
        String[][][] students = new String[3][][];
        students[0]=new String[][]{
                {"2101234","홍길동","남"},
                {"2101235","경복대","여"},
                {"2101236","한국인","남"},
                {"2101345","정상인","여"}
        };
        students[1]=new String[][]{
                {"2301345","구자철","남"},
                {"2301435","이가을","여"},
                {"2301443","김광현","남"},
                {"2301678","박종철","남"},
                {"2301679","올시즌","여"}
        };
        students[2]=new String[][]{
                {"2401234","한민국","여"},
                {"2401456","안우진","남"},
                {"2401789","이대한","남"}
        };

        int[][][] score = new int[students.length][][];
        for(int i=0;i<students.length;i++){
            score[i] = input.inputScore(students[i]);
        }

        int[][] classRank = new int[3][];
        for(int i=0;i<students.length;i++){
            compute.total(score[i]);
            classRank[i]=compute.rank(score[i]);
        }

        int[] schoolRank = compute.rankAll(score);

        output.printAll(students, score, classRank, schoolRank);
    }
}
