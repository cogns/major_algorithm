package A6투포인터;

public class T4슬라이딩윈도우 {
    public static void main(String[] args) {
//       정수 배열 nums와 정수 k가 주어질 때,
//        길이가 k인 연속된 부분 배열의 최대합을 구하기
        int[] nums = {1,4,2,10,23,3,1,0,20};
        int k = 4;
        int answer = 0;

        for(int i = 0 ; i < k ; i++){
            answer += nums[i];
        }

        for(int i = k ; i < nums.length; i++){
            answer = Math.max(answer, answer -nums[i-k]+nums[i]);
        }

        System.out.println(answer);

    }
}
