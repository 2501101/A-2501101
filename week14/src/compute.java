public class compute {
    public static void total(int[][] score){
        for(int i=0;i<score.length;i++){
            score[i][4]=0;
            for(int j=0;j<4;j++){
                score[i][4]+=score[i][j];
            }
        }
    }

    public static int[] rank(int[][] score){
        int[] r = new int[score.length];
        for(int i=0;i<r.length;i++) r[i]=1;

        for(int i=0;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(score[i][4]<score[j][4]) r[i]++;
            }
        }
        return r;
    }

    public static int[] rankAll(int[][][] score){
        int totalCount=0;
        for(int i=0;i<score.length;i++) totalCount+=score[i].length;

        int[] totals = new int[totalCount];
        int index=0;
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                totals[index++]=score[i][j][4];
            }
        }

        int[] r = new int[totals.length];
        for(int i=0;i<totals.length;i++) r[i]=1;
        for(int i=0;i<totals.length;i++){
            for(int j=0;j<totals.length;j++){
                if(totals[i]<totals[j]) r[i]++;
            }
        }
        return r;
    }
}
