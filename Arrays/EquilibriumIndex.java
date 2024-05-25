package Arrays;
public class EquilibriumIndex {

    public int solve(int[] A) {

        long[] pre = new long[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = A[i] + pre[i - 1];
        }

        for (int i = 0; i < A.length; i++) {

            long left = i == 0 ? 0 : pre[i - 1];
            long right = pre[A.length - 1] - pre[i];

            if (left == right)
                return i;
        }

        return -1;
    }
}
