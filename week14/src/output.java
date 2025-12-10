public class output {
    public static void printAll(String[][][] st, int[][][] sc, int[][] classR, int[] schoolR){
        int index=0;
        float[] classAvg = new float[3];

        for(int c=0;c<st.length;c++){
            System.out.println("*****************************************************************");
            System.out.println("*** "+(c+1)+"반 성적표 ***");
            System.out.println("*****************************************************************");
            System.out.println("학번 이름 국어 영어 수학 선택 총점 평균 반석차 학년석차 기타");
            System.out.println("*****************************************************************");

            float sum=0;
            for(int s=0;s<st[c].length;s++){
                float avg = sc[c][s][4]/4.0f;
                sum+=avg;

                System.out.print(st[c][s][0]+" "+st[c][s][1]+" ");
                for(int k=0;k<5;k++) System.out.print(sc[c][s][k]+" ");
                System.out.printf("%.2f %d %d",avg,classR[c][s],schoolR[index]);
                if(avg < sum/st[c].length) System.out.print(" 반평균 미만");
                System.out.println();
                index++;
            }

            classAvg[c]=sum/st[c].length;

            System.out.println("*****************************************************************");
            System.out.printf("%d반 전체 평균: %.2f\n",c+1,classAvg[c]);
            System.out.println("*****************************************************************");
        }

        float totalAvg=(classAvg[0]+classAvg[1]+classAvg[2])/3.0f;
        System.out.printf("학년 전체 평균: %.2f\n",totalAvg);
    }
}
