public class MergeSortedArrays {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {

        int n = A.length, m = B.length;
        int[] res = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (A[i] < B[j])
                res[k++] = A[i++];

            else
                res[k++] = B[j++];
        }

        while (i < n)
            res[k++] = A[i++];

        while (j < m)
            res[k++] = B[j++];

        return res;
    }
}
