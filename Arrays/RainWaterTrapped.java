public class RainWaterTrapped {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    // TC -> O(n)
    // SC -> O(n)
    public int trap(final int[] A) {

        int n = A.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for (int i = 0; i < n; i++) {

            if (i == 0)
                leftMax[i] = A[i];

            else
                leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1)
                rightMax[i] = A[i];

            else
                rightMax[i] = Math.max(rightMax[i + 1], A[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {

            int min = Math.min(leftMax[i], rightMax[i]);
            int currWater = min - A[i];

            if (currWater > 0)
                totalWater += currWater;
        }

        return totalWater;
    }
}
