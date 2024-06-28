package A5dp;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        int n = 1;
        long[] answer = new long[2001];

        answer[0] = 0;
        answer[1] = 1;
        answer[2] = 2;

        for (int i=3; i<answer.length; i++){
            answer[i] = (answer[i-1]%1234567)+(answer[i-2]%1234567);
        }

        System.out.println(answer[n]%1234567);

    }
}
