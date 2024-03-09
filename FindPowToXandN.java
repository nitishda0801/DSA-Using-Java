public class FindPowToXandN {
    public static int calculatePower(int x,int n) // time O(lon(N))
    {
        if(n==0) return 1;
        int mul=calculatePower(x, n/2);

        if(n%2==0)
        {
            return mul*mul;
        }
        return x*mul*mul;

    }
    public static void main(String[] args) {
        System.err.println(calculatePower(2, 10));
    }
}
