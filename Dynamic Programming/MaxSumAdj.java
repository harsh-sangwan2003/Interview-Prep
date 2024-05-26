public class MaxSumAdj {

    public int adjacent(int[][] A) {

        if (A[0].length == 1)
            return Math.max(A[0][0], A[1][0]);

        int[] dp = new int[A[0].length];
        dp[0] = Math.max(A[0][0], A[1][0]);
        dp[1] = Math.max(A[0][1], A[1][1]);
        dp[1] = Math.max(dp[0], dp[1]);

        for (int i = 2; i < dp.length; i++) {

            int exclude = dp[i - 1];
            int include = Math.max(A[0][i], A[1][i]);
            include += dp[i - 2];

            dp[i] = Math.max(include, exclude);
        }

        return dp[A[0].length - 1];
    }
}
