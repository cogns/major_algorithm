package A2dfs;

import java.util.*;

public class D5네트워크 {
    static boolean[] visited;
    static List<Integer>[] A;
    public static int main(int n, int[][] computers) {
        int answer = 0;
        A = new List[computers.length];
        visited = new boolean[computers.length];

        for(int i=0;i<computers.length;i++){
            A[i] = new ArrayList<>();
        }
        for(int i=0;i<computers.length;i++) {
            for(int j=0;j<computers[i].length;j++) {
                if(i==j) continue;
                if(computers[i][j] == 1) {
                    A[i].add(j);
                }
            }
        }
        for(int i=0;i<computers.length;i++) {
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    static void dfs(int start) {
        visited[start] = true;
        for(int i : A[start]) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }

}
