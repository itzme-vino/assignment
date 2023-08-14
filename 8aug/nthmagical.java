class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long num1 = a;
        long num2 = b;
        long mod = 1000000007;
        long lcm = (num1*num2)/gcd(num1,num2);
        long ans =0;
        long l =Math.min(num1,num2);
        long r = (long)1e18;
        while(l<=r)
        {
            long mid = l+(r-l)/2;
            long c = (mid/2)+(mid/b)-(mid/lcm);
            if(c==n)
            {
                ans = mid;
                r = mid-1;
            }
            else if(c<n)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return (int)(l%mod);
        
    }
    long gcd(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}