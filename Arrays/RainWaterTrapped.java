public class RainWaterTrapped {

    // TC -> O(n)
    // SC -> O(n)

    private int[] leftMax(int[] A) {

        int n = A.length;
        int[] left = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                left[i] = A[i];

            else
                left[i] = Math.max(left[i - 1], A[i]);
        }

        return left;
    }

    private int[] rightMax(int[] A) {

        int n = A.length;
        int[] right = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                right[i] = A[i];

            else
                right[i] = Math.max(right[i + 1], A[i]);
        }

        return right;
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {

        int n = A.length;

        int[] left = leftMax(A);
        int[] right = rightMax(A);

        int totalWater = 0;

        for (int i = 1; i < n - 1; i++) {

            int min = Math.min(left[i], right[i]);
            int water = min - A[i];

            if (water > 0)
                totalWater += water;
        }

        return totalWater;
    }
}
