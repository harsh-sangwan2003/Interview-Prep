public class EquilibriumIndex {

    // TC -> O(n)
    // SC -> O(n)
    public int solve(int[] A) {

        int n = A.length;
        long[] pre = new long[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];
        }

        for (int i = 0; i < n; i++) {

            long leftSum = 0, rightSum = 0;

            if (i == 0)
                rightSum = pre[n - 1] - A[0];

            else if (i == n - 1)
                leftSum = pre[n - 2];

            else {
                leftSum = pre[i - 1];
                rightSum = pre[n - 1] - pre[i];
            }

            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }
}
