public class CheckBit {

    public int solve(int A, int B) {

        if ((A & (1 << B)) != 0)
            return 1;

        else
            return 0;
    }
}
