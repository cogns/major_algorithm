package A4greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class G2체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        int answer = 0;

        Set<Integer> lostSet = new HashSet<>();
        Arrays.sort(reserve);

        for (int l : lost){
            lostSet.add(l);
        }

        for (int i=0; i< reserve.length; i++){
            if (lostSet.contains(reserve[i])){
                lostSet.remove(reserve[i]);
                reserve[i] = -1;
            }
        }

        for (int i=0; i< reserve.length; i++){
            if (reserve[i] == -1) continue;
            if (lostSet.contains(reserve[i]-1)){
                lostSet.remove(reserve[i]-1);
            } else if (lostSet.contains(reserve[i]+1)) {
                lostSet.remove(reserve[i]+1);
            }
        }
        answer = n- lostSet.size();
        System.out.println(answer);

    }
}
