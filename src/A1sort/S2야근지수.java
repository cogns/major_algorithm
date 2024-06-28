package A1sort;

import java.util.*;

public class S2야근지수 {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4, 3, 3};
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        long answer = 0;
        for (int w : works){
            queue.add(w);
        }

        for (int i=0; i<n; i++){
            if (queue.isEmpty())break;

            int temp = queue.poll();
            queue.add(temp-1);
        }
        while (!queue.isEmpty()){
            int temp = queue.poll();
            if (temp>0){

            }
        }

    }
}
