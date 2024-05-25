public class SubarrayWithSum {

    public int solve(int[] A, int B, int C) {

        if (B < 0 || B > A.length)
            return 0;

        int sum = 0;

        for (int i = 0; i < B; i++)
            sum += A[i];

        if (sum == C)
            return 1;

        for (int i = B; i < A.length; i++) {

            int prev = A[i - B];
            sum -= prev;
            sum += A[i];

            if (sum == C)
                return 1;
        }

        return 0;
    }
}
