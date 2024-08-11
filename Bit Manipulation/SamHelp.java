public class SamHelp {

    // TC -> O(logN)
    // SC -> O(1)
    public int solve(int A) {

        if(A==0)
        return 0;

        int help = 0;

        while(A!=1){

            if(A%2==0)
            A/=2;

            else{
                help++;
                A-=1;
            }
        }

        help++;
        return help;
    }
}
