package A2dfs;

public class D4피로도 {
    static boolean[] visited;
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[][] dungeons = {{80, 20}, {50,40}, {30,10}};
        int k = 80;
        visited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
    }

    static void dfs(int[][] dungons, int k, int count){
        if (count>max){
            max = count;
        }
        for (int i=0; i<dungons.length; i++){
            if(!visited[i] && k>= dungons[i][0]){
                dfs(dungons, k-dungons[i][1], count+1);
            }
        }
    }
}

