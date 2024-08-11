public class SingleNumber2 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    // TC -> O(N)
    // SC -> O(1)
    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) != 0)
            return true;

        return false;
    }

    public int singleNumber(final int[] A) {

        int ans = 0;

        for (int pos = 0; pos < 32; pos++) {

            int count = 0;
            for (int val : A) {

                if (checkBit(val, pos))
                    count++;
            }

            if (count % 3 != 0)
                ans += (1 << pos);
        }

        return ans;
    }
}
