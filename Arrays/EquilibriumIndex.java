public class EquilibriumIndex {

    // TC -> O(n)
    // SC -> O(1)
    public int solve(int[] A) {

        int n = A.length;
        int[] preSum = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                preSum[i] = A[i];

            else
                preSum[i] = preSum[i - 1] + A[i];
        }

        for (int i = 0; i < n; i++) {

            int leftSum = 0, rightSum = 0;

            if (i == 0)
                rightSum = preSum[n - 1] - A[0];

            else if (i == n - 1)
                leftSum = preSum[n - 2];

            else {
                leftSum = preSum[i - 1];
                rightSum = preSum[n - 1] - preSum[i];
            }

            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }
}
