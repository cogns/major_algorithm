package A5dp;

public class D5등굣길 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2,2}};
        int answer = 0;
        int[][] map = new int[n][m];

        for (int[] puddle : puddles){
            map[puddle[1]-1][puddle[0]-1] = -1;
        }
        map[0][0] = 1;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (map[i][j] != -1){
                    if (i>=1 && map[i-1][j] != -1){
                        map[i][j] += map[i-1][j]%1000000007;
                    }
                    if (j>=1 && map[i][j-1] != -1) {
                        map[i][j] += map[i][j-1]%1000000007;
                    }
                }
            }
        }

        answer = map[n-1][m-1]%1000000007;

        System.out.println(answer);
    }
}
