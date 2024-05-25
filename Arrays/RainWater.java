public class RainWater {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {

        int[] lmax = new int[A.length];
        int[] rmax = new int[A.length];

        for(int i=0; i<A.length; i++){

            if(i==0)
            lmax[i] = A[i];

            else 
            lmax[i] = Math.max(lmax[i-1],A[i]);
        }

        for(int i=A.length-1; i>=0; i--){

            if(i==A.length-1)
            rmax[i] = A[i];

            else 
            rmax[i] = Math.max(rmax[i+1],A[i]);
        }

        int water = 0;

        for(int i=1; i<A.length-1; i++){

            int min = Math.min(lmax[i-1],rmax[i+1]);
            int curr = min-A[i];

            if(curr>0)
            water+=curr;
        }

        return water;
    }
}
