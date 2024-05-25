public class SumOfSubarrays {

    public long subarraySum(int[] A) {

        long sum = 0;

        for (int i = 0; i < A.length; i++) {

            long freq = (i + 1) * 1L * (A.length - i);
            long contri = freq * A[i];
            sum += contri;
        }

        return sum;
    }
}
