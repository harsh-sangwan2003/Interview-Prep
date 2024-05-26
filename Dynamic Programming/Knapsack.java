public class Knapsack {

    public int solve(int[] A, int[] B, int C) {

        int n = A.length;
        int[][] dp = new int[n + 1][C + 1];

        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[0].length; j++) {

                int exclude = dp[i - 1][j];
                int include = 0;

                if (j >= B[i - 1])
                    include = A[i - 1] + dp[i - 1][j - B[i - 1]];

                dp[i][j] = Math.max(include, exclude);
            }
        }

        return dp[n][C];
    }
}
