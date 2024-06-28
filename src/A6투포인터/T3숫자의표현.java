package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3숫자의표현 {
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;

        for (int i=1; n-( (i*(i-1))/2 ) > 0; i++){
            if ((n-( (i*(i-1))/2 ))%i==0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
