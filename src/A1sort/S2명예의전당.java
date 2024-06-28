package A1sort;

import java.util.*;

public class S2명예의전당 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = {2000};
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<score.length; i++){
            System.out.println(i);
            pq.add(score[i]);
            if(pq.size()>k){
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        System.out.println(answer);



//        List<Queue<Integer>> auddP = new ArrayList<>();
//        LinkedList<Integer> list = (LinkedList<Integer>) pq;
//        for (int i = 0; i < score.length; i++) {
//            pq.add(score[i]);
//            if (pq.size() < k) {
//                auddP.add(pq);
//            } else if (pq.size() >= k) {
//                for (int j = 0; j < k; j++) {
//
//                }
//            }
//
//        }


    }
}

