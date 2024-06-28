package A5dp;

import java.util.Arrays;

public class D1DpBasic {
    public static void main(String[] args) {
//        1,4,5로 13을 만들 수 있는 조합중에 가장 작은 조홥의 개수
//        dfs, bfs는 너무 오래 걸림
        int[] numbers = {1,4,5};
//        12 9 8 중에 가장 작은 조합을 가진 조합의 개수에 +1
//        min(f(n-1), f(n-2), ...) +1
        int target = 13;
        int[] arr = new int[target+1];
        arr[1] = 1;
        for (int i=2; i<target; i++){
            int min = Integer.MAX_VALUE;
            for (int n : numbers){
                if (i-n>=1 && min > arr[i-n]){
                    min = arr[i-n];
                }
            }
        }

    }
}
