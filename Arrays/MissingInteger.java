public class MissingInteger {

    // TC -> O(n)
    // SC -> O(1)
    public int firstMissingPositive(int[] A) {

        int n = A.length;
        for (int i = 0; i < n; i++) {

            if (A[i] <= 0 || A[i] >= n + 2)
                A[i] = n + 2;
        }

        for (int i = 0; i < n; i++) {

            int idx = Math.abs(A[i]) - 1;
            if (idx >= 0 && idx < n) {

                if (A[idx] > 0)
                    A[idx] *= -1;
            }
        }

        for (int i = 0; i < n; i++) {

            if (A[i] > 0)
                return i + 1;
        }

        return n + 1;
    }
}
