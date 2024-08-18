public class FirstMissingPositive {

    // TC -> O(n)
    // SC -> O(1)
    public int firstMissingPositive(int[] A) {

        int n = A.length;
        for (int i = 0; i < n; i++) {

            if (A[i] > 0 && A[i] <= n) {

                int pos = A[i] - 1;
                if (A[i] != A[pos]) {

                    int temp = A[i];
                    A[i] = A[pos];
                    A[pos] = temp;
                    i--;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            if (A[i] != i + 1)
                return i + 1;
        }

        return n + 1;
    }
}
