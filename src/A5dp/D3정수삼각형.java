package A5dp;

public class D3정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int answer = 0;
        int n = triangle.length;

        for (int i=n-2; i>=0; i--) {
            for (int j=0; j<=i; j++) {
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }

        answer = triangle[0][0];

        System.out.println(answer);

    }
}
