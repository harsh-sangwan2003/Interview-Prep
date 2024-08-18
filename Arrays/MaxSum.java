public class MaxSum {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    // TC -> O(n)
    // SC -> O(1)

    // [1,2,3,4,-10]

    // currSum = 1+2+3+4+(-10)
    // maxSum = 10

    public int maxSubArray(final int[] A) {

        int maxSum = 0, currSum = 0;

        for (int val : A) {

            currSum += val;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }
}
