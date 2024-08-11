public class SingleNumber {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    // TC -> O(N)
    // SC -> O(1)
    public int singleNumber(final int[] A) {

        int xorVal = 0;

        for (int val : A)
            xorVal ^= val;

        return xorVal;
    }
}
