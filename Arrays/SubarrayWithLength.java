public class SubarrayWithLength {

    // TC -> O(n)
    // SC -> O(1)
    public int solve(int[] A, int B, int C) {

        int n = A.length;
        int sum = 0;

        for (int i = 0; i < B; i++)
            sum += A[i];

        if (sum == C)
            return 1;

        for (int i = B; i < n; i++) {

            int prev = A[i - B];
            sum -= prev;
            sum += A[i];

            if (sum == C)
                return 1;
        }

        return 0;
    }
}
