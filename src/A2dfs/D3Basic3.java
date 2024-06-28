package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D3Basic3 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {1,3}, {2,4}, {2,5}, {3,6}, {3,7}, {4,8}, {4,9}, {5,10}};

        for (int i=0; i<11; i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr){
            adjList.get(a[0]).add(a[1]);
        }
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        dfs(answer, temp, 1);
        System.out.println(answer);
    }

    static void dfs(List<List<Integer>> answer, List<Integer> temp, int start){
        if(adjList.get(start).isEmpty()){
            answer.add(new ArrayList<>());
            return;
        }
        for (int target : adjList.get(start)){
            temp.add(target);
            dfs(answer, temp, target);
            temp.removeLast();
        }

    }

}
