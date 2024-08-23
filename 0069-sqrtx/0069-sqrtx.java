class Solution {
    public int mySqrt(int x) {
        long r = x;
        long l = 0;
        while(r>=l)
        {
            long mid = l + (r-l)/2;
            if(mid*mid == x)
            {
                return (int)mid;
            }
            else if(mid*mid > x)
            {
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return (int)r;
    }
}